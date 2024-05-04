"""  Escreva um programa que le um numero inteiro n positivo, e uma sequencia
de n numeros inteiros, calcula e imprime quantos segmentos de numeros iguais
consecutivos compoem essa sequencia. """

def soma_numeros_consecutivos(n):
    numero_anterior = 0
    soma_numeros_consecutivos = 0

    i = 1
    while(i <= n):
        numero = int(input("Digite um numero: "))
        if(numero != numero_anterior):
            soma_numeros_consecutivos += 1
            numero_anterior = numero
        
        i += 1
    
    return soma_numeros_consecutivos


n = int(input("Digite a quantidade de numeros que ira digitar: "))
while(n <= 0):
    print("Numero invalido")
    print(f"{n} menor que 0")
    n = int(input("Digite um numero inteiro positivo valido: "))


quantidade_numeros_consecutivos = soma_numeros_consecutivos(n)
print("A quantidade de numeros iguais consecutivos que existe nessa sequencia é {}".format(quantidade_numeros_consecutivos))