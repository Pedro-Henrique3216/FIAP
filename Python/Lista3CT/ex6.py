""" Em uma prova de concurso com 70 questões haviam 20 pessoas concorrendo. Sabendo que
cada questão vale 1 ponto, escreva um algoritmo que lê a pontuação da prova obtida de cada
um dos candidatos e calcula:
a) a maior e a menor nota
b) o percentual de candidatos que acertaram até 20 questões, o percentual que acertaram
de 21 a 50 e o percentual que acertou acima de 50 questões
 """

i = 1
maior = 0
menor = 70

ate20 = 0
ate50 = 0
mais50 = 0
while(i <= 20):
    questoes = int(input("Digite qual foi sua pontuação: "))

    if(questoes <= 70):
        if(questoes > maior):
             maior = questoes
        if(questoes < menor):
            menor = questoes
        if(questoes <= 20):
            ate20 += 1
        elif(questoes <= 50):
            ate50 += 1
        else:
            mais50 += 1
        
        i += 1
    
percentual_ate20 = (ate20 / 70) * 100
percentual_ate50 = (ate50 / 70) * 100
percentual_mais50 = (mais50 / 70) * 100

print(f"A maior nota foi {maior}, e a menor nota foi {menor}")
print(f"Os percentuais foi: ate 20: {percentual_ate20:.2f}, de 20 ate 50: {percentual_ate50:.2f}, maior que 50: {percentual_mais50:.2f}")