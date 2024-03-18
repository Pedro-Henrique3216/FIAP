# O programa consiste em fazer o usuario adivinhar um numero sorteado
# com menos tentativas possiveis
# O programa sorteia um numero aleatorio entre 1 e 1000 e a cada tentativa
# que o usuário faz para acertar o numero ele informa se o numero sorteado
# é maior, menor ou igual ao numero chutado. Voce tem 10 chances para
# acertar o número no máximo.

import random 

num = random.randint(1, 1000)
acertou = False
tentativa = 0
for i in range(10):
    print("Tentativa: {}".format(i+1))
    tentativa = i+1
    chute = int(input("Digite um numero: "))
    if(chute > num):
        print("Tente um numero menor")
    elif(chute < num):
        print("Tente um numero maior")
    else:
        acertou = True
        break

if(acertou == True):
    print("Você acertou na {} tentativa".format(tentativa))
else:
    print("Você perdeu")