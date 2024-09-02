def gravar_arquivo(matriz: list, nome: str):
    arq = open(nome, mode="w", encoding="UTF-8")

    for linha in matriz:
        for dado in linha:
            arq.write(str(dado))
            arq.write(";")
        arq.write("\n")
    arq.close()

def ler_arquivo(nome: str):
    matriz = []
    arq = open(nome, "r", encoding="UTF-8")

    if len(arq.readline()) != 0:
        for linha in arq:
            dados = linha.split(";")
            reg = []
            for i in range(6):
                if i < 5:
                    reg.append(dados[i])
                else:
                    reg.append(float(dados[i]))
            matriz.append(reg)

    arq.close()
    return matriz

