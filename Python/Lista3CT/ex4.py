""" Dados n um inteiro positivo e uma sequência de n números reais, escreva um algoritmo que
conta e imprime a quantidade de números positivos e a quantidade de números negativos. """

quantidade_numero = int(input("Digite a quantidade de numeros que ira informar: "))

positivo = 0
negativo = 0
for i in range(quantidade_numero):
    numero = int(input("Digite um numero: "))
    if(numero > 0):
        positivo += 1
    elif(numero < 0):
        negativo += 1

print(f"A quantidade de numero positivos é {positivo}")
print(f"A quantidade de numeros negativos é {negativo}")