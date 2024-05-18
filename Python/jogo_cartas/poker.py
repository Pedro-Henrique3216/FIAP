import baralho

deck = baralho.cria("maco")

baralho.embaralha(deck)

mao_jgd1 = baralho.distribui(deck, 2)
mao_jgd2 = baralho.distribui(deck, 2)

mesa = baralho.distribui(deck, 2)

print(mao_jgd1)

print(mesa)

print(mao_jgd2)