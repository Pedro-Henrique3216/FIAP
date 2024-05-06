#1. Escreva um programa que cria uma lista de strings e preenche essa lista com 10 valores que
#serão digitados pelo usuário. Imprima a lista na tela.


strings = []

for n in range(10):
    palavra = input("Digite uma String: ")
    strings.append(palavra)


print(strings)