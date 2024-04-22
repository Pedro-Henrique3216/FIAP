# trocando letras das palavras sem usar o replace
frase = input("Escreva uma frase: ")

letra = input("Digite uma letra: ").lower()
while len(letra) != 1:
    letra = input("Erro digite uma letra: ").lower()

outher_frase = ""

letra_M = letra.upper()
for i in frase:
    if(i == letra or i == letra_M):
        outher_frase += "*"
    else:
        outher_frase += i

print(outher_frase)