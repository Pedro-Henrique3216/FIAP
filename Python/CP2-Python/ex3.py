""" Problema da troca de dinheiro, suponha que queremos trocar o valor de uma
cedula x por moedas nos valores a e b. Sua tarefa neste exercicio e ler os valores x,
a e b e imprimir se e possivel ou nao efetuar a troca. Na situacao que seja possivel,
imprima a quantidade de moedas de cada um dos valores necessarias para efetuar a
troca. """

valor_cedula = int(input("Digite o valor da cedula: "))

moeda1 = int(input("Digite o valor de uma moeda: "))

moeda2 = int(input("Digite o valor da outra moeda: "))


if(valor_cedula % moeda1 == 0):
    quantidade_moeda = valor_cedula / moeda1
    print("{} moeda(s) de {} e 0 moeda(s) de {}".format(quantidade_moeda, moeda1, moeda2))
elif(valor_cedula % moeda2 == 0):
    quantidade_moeda = valor_cedula / moeda2
    print("0 moeda(s) de {} e {} moeda(s) de {}".format(moeda1, quantidade_moeda, moeda2))
else:
    posivel = ""
    for i in range(valor_cedula // moeda1 + 1):
        if((valor_cedula - i * moeda1) % moeda2 == 0):
            quantidade_moeda1 = i
            quantidade_moeda2 = (valor_cedula - quantidade_moeda1 * moeda1) // moeda2
            posivel = "{} moeda(s) de {} e {} moeda(s) de {}".format(quantidade_moeda1, moeda1, quantidade_moeda2, moeda2)
            break
        else:
            posivel = "Não é possivel fazer a troca"

    print(posivel)

    