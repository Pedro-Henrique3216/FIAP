""" Dados o número n de alunos de uma turma de Algoritmos e suas notas da primeira prova,
determinar a média das notas dessa turma. Considere que o usuário digite as informações
corretamente. """

quantidade_alunos = int(input("Digite a quantidade de alunos que tem na sala: "))
sum = 0
for i in range(quantidade_alunos):
    sum += float(input("Digite sua nota da Primeira prova: "))

media = sum / quantidade_alunos

print(f"A media das notas da rimeira prova é {media:.2f}")