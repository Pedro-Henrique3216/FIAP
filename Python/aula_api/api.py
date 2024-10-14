from flask import Flask, request, jsonify
from flask_cors import CORS, cross_origin
from db import carros
import banco_carro as bc


app = Flask(__name__)
cors = CORS(app, origins="http://localhost:5000")

@app.route("/carros", methods=["GET"])
@cross_origin()
def get_all_cars():
    return (jsonify(carros), 200)

@app.route("/carros/<int:id>", methods=["GET"])
@cross_origin()
def get_carro (id):
 for car in carros :
     if id == car ["id"]:
        return jsonify (car) , 200
 info = {"title": "Nao encontrado", "status" : 404}
 return jsonify(info) , 404

@app.route("/carros", methods=["POST"])
@cross_origin()
def cadastrar_carro():
    dado = request.json
    print(dado)
    if "montadora" not in dado or "modelo" not in dado or "ano" not in dado or "placa" not in dado:
        info = {"title": "Erro", "status" : 400}
        return jsonify(info) , 400
    ultimo_id = len(carros)
    carro = {'id': ultimo_id + 1, 'montadora': dado["montadora"], 'modelo': dado["modelo"], 'ano': dado["ano"], 'placa': dado["placa"]}
    carros.append(carro)
    return jsonify(carro), 201

@app.route("/carros/<int:id>", methods=["PUT"])
@cross_origin()
def altera_carro_by_id(id):
    data = request.json
    for car in carros:
        if id == car["id"]:
            carro = car
            
    if not carro:
        info = {"title": "Nao encontrado", "status" : 404}
        return jsonify(info) , 404
    
    carro["montadora"] = data["montadora"] if "montadora" in data else car["montadora"]
    carro["modelo"] = data["modelo"] if "modelo" in data else car["modelo"]
    carro["ano"] = data["ano"] if "ano" in data else car["ano"]
    carro["placa"] = data["placa"] if "placa" in data else car["placa"]
    return jsonify(carro), 200

@app.route("/carros/update/<int:id>", methods=["PUT"])
@cross_origin()
def altera_carro_by_id2(id):
    data = request.json
    for ind, car in enumerate(carros):
        if id == car["id"]:
            new_car = {}
            new_car.update({"id": id})
            new_car.update(data)
            carros[ind] = new_car
            return jsonify(carros[ind]), 200
            
    
    info = {"title": "Nao encontrado", "status" : 404}
    return jsonify(info) , 404

@app.route("/carros/oracle", methods=["POST"])
@cross_origin()
def insere_carro_oracle():
    carro = request.json
    try:
        bc.insere(carro)
        return carro, 201
    except Exception as e:
        return {'title': 'Nao foi possivel inserir carro no banco', 'status': 500}, 500

@app.route("/carros/oracle/<int:id>", methods=["GET"])
@cross_origin()
def recupera_id_oracle(id):
    try:
        carro = bc.recupera_id(id) 
        if carro == None:
            return {'title': f'Não existe carro com o id: {id}', 'status': 404}, 404
        else:
            return (carro, 200)
    except Exception as e:
        return {'title': 'Erro no banco de dado', 'status': 500}, 500

@app.route("/carros/oracle", methods=["PUT"])
@cross_origin()
def altera_carro_oracle():
    carro = request.json
    bc.update(carro)
    return carro, 200

    



if __name__ == "__main__":
    app.run(debug=True)