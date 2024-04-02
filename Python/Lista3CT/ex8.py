""" Um número inteiro positivo n é denominado primo se existirem apenas dois divisores inteiros
positivos dele: o 1 e o próprio n. Escreva um algoritmo que recebe um inteiro n e verifica
se n é primo ou não. """

numero = int(input("Digite um numero: "))

i = 1

divisores = 0

while(i <= numero):
    if(numero % i == 0):
        divisores += 1
    
    i += 1

if(divisores == 2):
    print(f"{numero} é um numero primo")
else:
    print(f"{numero} não é um numero primo")