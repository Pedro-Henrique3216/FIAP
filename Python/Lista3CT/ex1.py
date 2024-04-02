# Dada uma sequência de números inteiros onde o último elemento é o 0, escreva um algoritmo
# que calcula a soma dos números pares da sequência.

numero = int(input("Digite um numero: "))
soma = 0
while(numero != 0):
    if(numero % 2 == 0):
        soma += numero
    numero = int(input("Digite um numero: "))

print(f"A soma dessa sequência é {soma}")