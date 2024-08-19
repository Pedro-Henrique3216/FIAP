def cria_tabuleiro():
    tabuleiro = []
    for i in range(3):
        tabuleiro.append([""] * 3)
    return tabuleiro

tabuleiro = cria_tabuleiro()

tabuleiro[0][0] = "x"
tabuleiro[1][1] = "o"
tabuleiro[2][2] = "x"

for linha in tabuleiro:
    print(linha)    