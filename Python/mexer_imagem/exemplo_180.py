import Imagem

(matrizR, matrizG, matrizB) = Imagem.getMatrizImagemColorida("gato.jpg")

lin = len(matrizR)
col = len(matrizR[0])

respR = []
respG = []
respB = []

for i in range(lin):
    respR.append([0] * col)
    respB.append([0] * col)
    respG.append([0] * col)

for i in range(lin):
    for j in range(col):
        respR[lin - 1 - i][col - 1 - j] = matrizR[i][j]
        respG[lin - 1 - i][col - 1 - j] = matrizG[i][j]
        respB[lin - 1 - i][col - 1 - j] = matrizB[i][j]

Imagem.salvaImagemColorida("gato4.jpg", respR, respG, respB)


