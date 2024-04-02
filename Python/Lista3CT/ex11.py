""" Se Fn é o n-ésimo número da sequência de Fibonacci, podemos calculá-la através da seguinte
fórmula de recorrência:
Vamos mostrar os 10 primeiros números da sequência de Fibonacci:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55
Escreva um algoritmo que dado n, calcula o n-ésimo número da sequência de Fibonacci. """

termo = int(input("Digite qual o termo da sequancia você ira querer: "))

lista = [1, 1]

i = 2

while(i < termo):
    sum = lista[i-2] + lista[i-1]
    lista.append(sum)
    i += 1

print(f"o termo da sequencia que você escolheu é {lista[termo - 1]}")