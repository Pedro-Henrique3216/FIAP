from flask import Flask, request, jsonify
import negocio


app = Flask(__name__)

@app.route("/partida", methods=["POST"])
def cadastrar_partida():
    data = request.json
    negocio.cadastra_partida(data)
    return "", 201


@app.route("/partida", methods=["GET"])
def buscar_partidas():

    #saldo gols, 
    #pontos, jogos e aproveitamento
    partidas = negocio.consulta_tabela_classificao()
    for i in range(len(partidas)):
        partidas[i] = {"id": partidas[i][0], "nome": partidas[i][1], "sg": partidas[i][2], "pontos": partidas[i][3], "jogos": partidas[i][4], "aproveitamento": partidas[i][5]}
    return jsonify({"Partidas": partidas}), 200

if __name__ == "__main__":
    app.run(debug=True)