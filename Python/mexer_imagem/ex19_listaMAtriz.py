import Imagem

def insereColuna(ini: int, valor: int, mat: list):
    linFIm = 550
    linIni = 550 - valor * 5

    colFim = ini + 49

    while linIni <= linFIm:
        colIni = ini
        while colIni < colFim:
            mat[linIni][colIni] = 0
            colIni = colIni + 1
        linIni = linIni + 1

imagem = []

for i in range(600):
    imagem.append([255] * 800)

insereColuna(50, 60, imagem)
insereColuna(100, 80, imagem)
insereColuna(150, 70, imagem)
insereColuna(200, 85, imagem)

Imagem.salvaImagemCinza("histograma.png", imagem)