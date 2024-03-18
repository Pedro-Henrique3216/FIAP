preco = float(input("Informe o preço de etiqueta: "))
codigo = int(input("Opção de pagamento (1-4): "))

match codigo:
    case 1:
        novo__preco = preco - preco * 0.1
        print("O valor a ser pago será de {}".format(novo__preco))
    case 2:
        novo__preco = preco - preco * 0.5
        print("O valor a ser pago será de {}".format(novo__preco))
    case 3:
        parcela = preco / 2
        print("O valor de cada parcela será {}".format(parcela))
    case 4:
        novo__preco = preco * 1.07
        parcela = novo__preco / 4
        print("O valor a ser pago será de {} em 4X de {}".format(novo__preco, parcela))
    case _:
        print("Opção de pagamento invalida")
