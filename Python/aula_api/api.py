from flask import Flask, request, jsonify
from db import carros


app = Flask(__name__)

@app.route("/carros", methods=["GET"])
def get_all_cars():
    return (jsonify(carros), 200)

@app.route("/carros/<int:id>", methods=["GET"])
def get_carro (id):
 for car in carros :
     if id == car ["id"]:
        return jsonify (car) , 200
 info = {"title": "Nao encontrado", "status" : 404}
 return jsonify(info) , 404

@app.route("/carros", methods=["POST"])
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



if __name__ == "__main__":
    app.run(debug=True)