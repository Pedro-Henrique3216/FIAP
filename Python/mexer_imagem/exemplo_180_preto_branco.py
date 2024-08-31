import Imagem

matriz = Imagem.getMatrizImagemCinza("gato.jpg")

lin = len(matriz)
col = len(matriz[0])

rel = []
for i in range(lin):
    rel.append([0] * col)

for i in range(lin):
    for j in range(col):
        rel[lin - 1 - i][col - 1 - j] = matriz[i][j]
       

Imagem.salvaImagemCinza("gato5.jpg", rel)
