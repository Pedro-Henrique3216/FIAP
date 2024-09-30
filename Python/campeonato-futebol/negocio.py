import banco

#PARTIDA DICIONARIO
jogo = {"casa": "Corinthians", "visit": "Santos", "gv": 2, "gc": 3, "rodada": 1}

def cadastra_time(nome_time: str) -> dict:
    time = banco.consulta_time(nome_time)
    if time == None:
        time = {"nome": nome_time, "vitorias": 0, "empates": 0, "derrotas": 0, "gols_contra": 0, "gols_pro": 0}
        banco.insere_time(time)
    return time

def cadastra_partida(partida: dict):
    #para cada time dentro da partida, faço a consulta dele no banco
    #se ele não existe, preciso cadastrá-lo no banco
    #verifico o vencedor da partida ee atualizo as informações de acordo com 
    #o resultado e atualizo os time no banco de dados
    time_casa = cadastra_time(partida["casa"])
    time_visit = cadastra_time(partida["visit"])

    if partida["gc"] > partida["gv"]:
        time_casa["vitorias"] = time_casa["vitorias"] + 1
        time_visit["derrotas"] = time_visit["derrotas"] + 1
    elif partida["gc"] < partida["gv"]:
        time_casa["derrotas"] = time_casa["derrotas"] + 1
        time_visit["vitorias"] = time_visit["vitorias"] + 1
    else:
        time_casa["empates"] = time_casa["empates"] + 1
        time_visit["empates"] = time_visit["empates"] + 1

    time_casa["gols_pro"] = time_casa["gols_pro"] + partida["gc"]
    time_casa["gols_contra"] = time_casa["gols_contra"] + partida["gv"]

    time_visit["gols_pro"] = time_visit["gols_pro"] + partida["gv"]
    time_visit["gols_contra"] = time_visit["gols_contra"] + partida["gc"]

    banco.atualiza_time(time_casa)
    banco.atualiza_time(time_visit)
    
    partida["casa"] = time_casa["id"]
    partida["visit"] = time_visit["id"]
    banco.insere_partida(partida)

def consulta_tabela_classificao() -> list:
    #calcular as informações faltantes da tabela: saldo gols, 
    #pontos, jogos e aproveitamento e mostrar e retornar 
    #todas as informações em uma lista de tuplas ou uma 
    #lista de listas.
    times = banco.recupera_times()
    tabela = []
    for time in times:
        id, nome, vitorias, empates, derrotas, gc, gp = time
        saldo_gols = gp - gc
        pontos = vitorias * 3 + empates
        jogos = vitorias + empates + derrotas
        aproveitamento = pontos / (jogos * 3) * 100
        tabela.append((id, nome, saldo_gols, pontos, jogos, f"{aproveitamento}%"))
        
    return tabela
    


# cadastra_partida(partida=jogo)

print(consulta_tabela_classificao())

