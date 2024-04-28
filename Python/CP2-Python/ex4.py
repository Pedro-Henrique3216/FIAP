""" Dados um numero inteiro n e uma sequencia de n numeros reais, escreva
um algoritmo que calcula a somatoria de numeros que sao maiores que 50 e conta
quantos numeros sao menores do que 100. """


sequencia = int(input("Digite a quantidade de numero que haverá na sequencia: "))

while(sequencia <= 0):
    print("quantidade invalida")
    print(f"{sequencia} menor que 0")
    sequencia = int(input("Digite uma quantidade valida: "))

soma = 0
quantidade_numero = 0

for i in range(sequencia):
    numero = int(input("Digite um numero: "))
    
    if(numero > 50):
        soma += numero
    
    if(numero < 100):
        quantidade_numero += 1


print("A quantidade de numero menores que 100 é {} e a somatoria de todos os numeros maiores que 50 é {}".format(quantidade_numero, soma))