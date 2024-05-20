import baralho as bar

def soma_pontos(mao: list) -> int:
    soma = 0
    for c in mao:
        if(c[0] > 10):
            soma += 10
        else:
            soma += c[0]
    
    return soma

monte = bar.cria("maco")

bar.embaralha(monte)

mao_hum = bar.distribui(monte, 2)

mao_cpu = bar.distribui(monte, 2)

print("Você:{}".format(bar.to_str_list(mao_hum)))
print("Pontos: {}\n".format(soma_pontos(mao_hum)))

resp = input("Quer mais carta (s/n)? ")
while(resp == "s" and soma_pontos(mao_hum) < 21):
    mao_hum.append(bar.compra(monte))
    print("\nVocê:{}".format(bar.to_str_list(mao_hum)))
    print("Pontos: {}".format(soma_pontos(mao_hum)))
    if(soma_pontos(mao_hum) > 21):
        print("Você estourou\n")
    elif(soma_pontos(mao_hum) == 21):
        print("Você ganhou\n")
    else:
        resp = input("\nQuer mais carta(s/n)? ")

pontos_cpu = soma_pontos(mao_cpu)
while pontos_cpu < 16:
    mao_cpu.append(bar.compra(monte))
    pontos_cpu = soma_pontos(mao_cpu)

print("CPU:{}".format(bar.to_str_list(mao_cpu)))
print("Pontos: {}".format(soma_pontos(mao_cpu)))



