#Escreva um programa que pede para o usuário digitar um inteiro n. Depois seu algoritmo
#pede para o usuário digitar uma sequência de n números reais. Após a entrada dos dados, seu
#programa deverá imprimir os resultados das seguintes somas: v[0] +v[n−1] , v[1] +v[n−2],
#v[2] + v[n − 3], ...; até que todos os valores informados tenham participado de alguma soma.


sequencia = int(input("Qtd Sequencia: "))
numeros = []

for n in range(sequencia):
    numero = float(input("Digite um numero: "))
    numeros.append(numero)


i = 0
somas = []
while(i < len(numeros)):
    somas.append(numeros[i] + numeros[sequencia - (i + 1)])
    i += 1

print(somas)