""" Escreva um programa que recebe uma String e imprime uma outra String com
os caracteres invertidos. Obrigatoriamente, nesse exercicio, use um comando de
repeticao (while ou for). """

def inverte_palavra(palavra):
    palavra_invertida = ""

    i = len(palavra) - 1

    while(i >= 0):
        palavra_invertida += palavra[i]
        i -= 1

    return palavra_invertida

palavra = input("Digite uma palavra: ")

palavra_invertida = inverte_palavra(palavra)

print("A palavra original é {} e essa palavra invertida fica {}".format(palavra, palavra_invertida))