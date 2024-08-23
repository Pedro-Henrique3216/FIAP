def ganhou(tabuleiro, jogador):
    diagonal_ganha = True
    n = 0
    for i in range(len(tabuleiro)):
        if tabuleiro[i][n] != jogador:
            diagonal_ganha = False
        n += 1
    if diagonal_ganha:
        return True
    else:
        diagonal_ganha = True

    n = 2
    for i in range(len(tabuleiro)):
        if tabuleiro[i][n] != jogador:
            diagonal_ganha = False
        n -= 1

    linha_ganha = True 
    coluna_ganha = True
    for i in range(len(tabuleiro)):
        linha_ganha = True
        coluna_ganha = True
        for j in range(len(tabuleiro[0])):
            if tabuleiro[i][j] != jogador:
                linha_ganha = False
            if tabuleiro[j][i] != jogador:
                coluna_ganha = False
        if linha_ganha or coluna_ganha:
            break      
    
    if(coluna_ganha or linha_ganha or diagonal_ganha):
        return True
    
    return False

def logica_jogo(tabuleiro, jogador):
    while True:
        linha = int(input("Digite a linha que deseja jogar: "))
        coluna = int(input("Digite a coluna que deseja jogar: ")) 
        while linha > 3 or linha < 1:
            linha = int(input("Digite uma linha valida: ")) 
        while coluna > 3 or coluna < 1:
            coluna = int(input("Digite uma coluna valida: "))

        linha -= 1
        coluna -= 1
        if tabuleiro[linha][coluna] == " ":
            tabuleiro[linha][coluna] = jogador
            break
        else:
            print("espaço ocupado")

def jogo(tabuleiro, jogadorA, jogadorB, round):
    comeca = jogadorA
    for i in range(round):
        print(f"Round: {i + 1}")
        printa_tabuleiro(tabuleiro)
        while True:
            logica_jogo(tabuleiro, comeca)
            printa_tabuleiro(tabuleiro)
            if(ganhou(tabuleiro, comeca)):
                print(f"Jogador {comeca} ganhou")
                break
            comeca = jogadorB if comeca == jogadorA else jogadorA

def monta_tabuleiro():
    tabuleiro = []
    for i in range(3):
        tabuleiro.append([" "] * 3)
    return tabuleiro

def printa_tabuleiro(tabuleiro):
    for linha in tabuleiro:
        print(linha)
    
    print()

if __name__ == "__main__":
    tabuleiro = monta_tabuleiro()
    round = int(input("Quantos round deseja jogar: "))
    jogo(tabuleiro, "X", "O", round)
       