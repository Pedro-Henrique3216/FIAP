import random

def busca(matriz: list, valor: object) -> list:
    linhas = len(matriz)
    coluna = len(matriz[0])

    for i in range(linhas):
        for j in range(coluna):
            if matriz[i][j] == valor:
                return[i, j]
    return [-1, -1]

lista = []
for i in range(3):
    lista.append([0] * 3)

for i in range(len(lista)):
    for j in range(len(lista[0])):
        lista[i][j] = random.randint(5, 50)

print(lista)

print(busca(lista, 15))