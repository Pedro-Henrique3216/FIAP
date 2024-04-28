""" Uma fabrica pretende aumentar o preco de seus produtos, porem precisa saber
qual sera o maior aumento em R$ e qual o maior aumento em percentual. Sua
tarefa e escrever um algoritmo que le a quantidade n de produtos que a empresa
deseja aumentar, para cada produto o usuario devera informar dois numeros reais
para cada produto, o primeiro e o preco atual e o segundo e o preco reajustado. Seu
algoritmo devera mostrar o maior aumento percentual e o maior aumento em reais
(R$) entre os n produtos. Observe que o maior aumento percentual pode nao ser,
1
necessariamente, o maior aumento em reais. Por exemplo, um produto passou de
0,50 para 1,00 que gerou um aumento percentual de 100% porem o aumento em R$
foi de 0,50. Ja um outro produto passou de 20,00 para 22,00 um aumento percentual
de 10% mas aumentou R$ 2,00. """


quantidade_produtos = int(input("Digite a quantidade de produtos que irá digitar: "))
while(quantidade_produtos <= 0):
    print("Quantidade de produtos invalida, a quantidade precisa ser um numero maior que 0")
    quantidade_produtos = int(input("Digite uma quantidade de produtos valida: "))


for i in range(quantidade_produtos):
    preco_atual = float(input("Digite o preço atual do produto: "))
    preco_reajustado = float(input("Digite o preço reajustado do produto: "))

    aumento = preco_reajustado - preco_atual

    aumento_percentual = preco_reajustado * 100 / preco_atual - 100

    print("O produto passou de {:.2f} para {:.2f}, então seu aumento foi de R$ {:.2f} e seu aumento percentual foi de {:.2f}%".format(preco_atual, preco_reajustado, aumento, aumento_percentual))