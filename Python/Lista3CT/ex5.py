""" Escreva um algoritmo que, dados um número inteiro positivo n, imprime na tela a contagem
de todos os divisores positivos de n. """

numero = int(input("Digite um numero inteiro positivo: "))

i = 1
sum = 0

while(i <= numero):
    if(numero % i == 0):
        sum += 1
    
    i += 1

print(f"A contagem de todos os divisores de {numero} é {sum}")