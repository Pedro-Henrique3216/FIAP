""" Altere o algoritmo anterior para, além da média, contar os alunos que tiraram entre 0 e 5, 0
(0 ≤ nota < 5, 0) e acima de 5, 0 (nota ≥ 5, 0) """

quantidade_alunos = int(input("Digite a quantidade de alunos que tem na sala: "))
sum = 0

abaixo5 = 0
acima5 = 0
for i in range(quantidade_alunos):
    nota = float(input("Digite sua nota da Primeira prova: "))
    sum += nota
    if(nota < 5):
        abaixo5 += 1
    else:
        acima5 += 1

media = sum / quantidade_alunos

print(f"A media das notas da rimeira prova é {media:.2f}")
print(f"A quantidade de alunos que tirou abaixo de 5 foi: {abaixo5} \nA quantidade de alunos que tiraram acima de 5 foi: {acima5}")