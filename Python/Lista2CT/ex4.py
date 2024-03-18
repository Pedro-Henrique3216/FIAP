dias_uteis = int(input("Digite o total de dias uteis: "))
horas_trabalhadas = int(input("Digite o total de horas trabalhadas: "))
salario_hora = float(input("Digite o valor da hora trabalhada: "))

horario_normal = 8 * dias_uteis

hora_extra = horas_trabalhadas - horario_normal

valor_hora_extra = hora_extra * salario_hora * 1.5

salario = valor_hora_extra + salario_hora * horario_normal

print("O funcionario recebeu R${:.2f} de hora extra e teve o salario final de R${:.2f}".format(valor_hora_extra, salario))