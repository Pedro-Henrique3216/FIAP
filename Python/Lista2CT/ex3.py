time1 = input("Digite o nome do time 1: ")
gols_time1 = int(input("Digite o numero de gols marcados do time 1: "))

time2 = input("Digite o nome do time 2: ")
gols_time2 = int(input("Digite o numero de gols marcados do time 2: "))

if(gols_time2 > gols_time1):
    print("Time {} é o vencedor".format(time2))
elif(gols_time1 > gols_time2):
    print("Time {} é o vencedor".format(time1))
else:
    print("Empate")