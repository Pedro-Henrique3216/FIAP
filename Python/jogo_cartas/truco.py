import baralho as bar

def jogada_hum(mao):
    print(bar.to_str_list(mao))
    pos = int(input("Informe a carta que deseja jogar (0, 1, 2): "))
    return mao.pop(pos)

def jogada_cpu(mao):
   return mao.pop(0)

def valor_carta(c):
    if c[0] <= 3 and c[0] >= 1:
        return c[0] * 20
    elif c[0] == 11:
        return 12
    elif c[0] == 12:
        return 11
    else:
        return c[0]

def vencedor(c1, c2):
    valor_c1 = valor_carta(c1)
    valor_c2 = valor_carta(c2)
    if(valor_c1 > valor_c2):
        return -1
    elif(valor_c1 == valor_c2):
        return 0
    else:
        return 1
deck = bar.cria("truco")

# print(bar.to_str_list(deck))
bar.embaralha(deck)

mao_hum = bar.distribui(deck, 3)
mao_cpu = bar.distribui(deck, 3)

vaza_hum = 0
vaza_cpu = 0

for _ in range(3):
    carta_hum = jogada_hum(mao_hum)
    carta_cpu = jogada_cpu(mao_cpu)
    resp = vencedor(carta_hum, carta_cpu)
    if(resp  == 1):
        vaza_hum += 1
    elif resp == 1:
        vaza_cpu += 1
    print(f"{bar.to_str(carta_hum)} * {bar.to_str(carta_cpu)}")