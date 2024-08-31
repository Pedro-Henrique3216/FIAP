import Imagem

matriz = Imagem.getMatrizImagemCinza("gato.jpg")

lin = len(matriz)
col = len(matriz[0])
print(f"Dimensoes {lin}x{col}")

for i in range(lin):
    for j in range(col):
        if matriz[i][j] <= 128:
            matriz[i][j] = 0
        else:
            matriz[i][j] = 255

Imagem.salvaImagemCinza("gato2.jpg", matriz)

matriz = Imagem.getMatrizImagemCinza("wallpaper.png")

lin = len(matriz)
col = len(matriz[0])

matriz.reverse()

Imagem.salvaImagemCinza("wallpaper2.png", matriz)


