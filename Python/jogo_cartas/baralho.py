import random
def cria(tipo):
    naipe = ("♦", "♣", "♠", "♥")
    monte = []
    if(tipo == "maco"):
        for i in range(1, 14):
            for n in naipe:
                    monte.append((i, n))
    #TODO crie os outros tipos de baralho (truco e 2maco)
    if(tipo == "2maco"):
        for i in range(2):
            for i in range(1, 14):
                for n in naipe:
                    monte.append((i, n))
    if(tipo == "truco"):
        for i in range(4, 14):
            for n in naipe:
                monte.append((i, n))
    
    return monte

def to_str(carta):
    if carta[0] == 13:
        return f"A{carta[1]}"
    if carta[0] == 10:
        return f"J{carta[1]}"
    if carta[0] == 11:
        return f"Q{carta[1]}"
    if carta[0] == 12:
        return f"K{carta[1]}"
    else:
        return f"{carta[0]}{carta[1]}"
  
def compra(monte: list):
    if(len(monte) != 0):
        return monte.pop()
    return None

def distribui(monte: list, qtd: int) -> list:
    mao = []
    for _ in range(qtd):
        mao.append(compra(monte))

    return mao

def embaralha(monte: list):
    for _ in range(500):
        i = random.randint(0, len(monte) - 1)
        j = random.randint(0, len(monte) - 1)
        monte[i], monte[j] = monte[j], monte[i]

    # random.shuffle
        
if(__name__ == "__main__"):
    deck = cria("maco")
    # for card in deck:
    #     print(to_str(card))

    embaralha(deck)
    for i in range(1, 14):

        print(deck.count((i, "♥")))
        print(deck.count((i, "♦")))
        print(deck.count((i, "♣")))
        print(deck.count((i, "♠")))
    c = compra(deck)

    print(distribui(deck, 3))

    while c != None:
        print(to_str(c))
        c = compra(deck)


