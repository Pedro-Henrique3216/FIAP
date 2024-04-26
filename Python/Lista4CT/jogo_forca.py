import random 
sorteada = ["ana", "macaco", "elefante", "frango assado"]

sorteada = random.choice(sorteada)

erro = 0
segredo = ""
chutadas = " "
for c in sorteada:
    if c in chutadas:
        segredo += c + " "
    else:
        segredo += "- "
    

while erro < 6 and "-" in segredo:
    print(segredo)
    print(f"Erro: {erro}")
    letra = input("Informe a letra: ").lower()
    chutadas += letra

    segredo = ""
    for c in sorteada:
        if c in chutadas:
            segredo += c + " "
        else:
            segredo += "- "

    if not letra in sorteada:
        erro += 1

if erro == 6:
    print(f"Você foi enforcado e a palavra era {sorteada}")
else:
    print(f"Parabéns, você acertou {sorteada}")
