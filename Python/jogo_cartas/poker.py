import baralho

deck = baralho.cria("maco")

baralho.embaralha(deck)

mao_jgd1 = baralho.distribui(deck, 2)
mao_jgd2 = baralho.distribui(deck, 2)

mesa = baralho.distribui(deck, 2)

print("Jogador 1 {}".format(baralho.to_str_list(mao_jgd1)))

print("mesa {}".format(baralho.to_str_list(mesa)))

print("Jogador 2 {}".format(baralho.to_str_list(mao_jgd2)))