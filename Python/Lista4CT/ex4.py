frase = input("Escreva uma frase: ")

letra = input("Digite umas letras: ").lower()

letra = list(letra)

for i in letra:
    frase = frase.replace(i, "*")

print(frase)