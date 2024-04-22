# trocando letras das palavras sem usar o replace
frase = input("Escreva uma frase: ").lower()

letra = input("Digite uma letra: ").lower()

outher_frase = ""
for i in frase:
    if(i == letra):
        outher_frase += "*"
    else:
        outher_frase += i

print(outher_frase)