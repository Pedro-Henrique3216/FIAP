preco = float(input("Digite o preco do produto: "))

desconto = float(input("Informe o percentual de desconto: "))

valorDesconto = preco * desconto / 100

precoComDesconto = preco - valorDesconto

print("O valor do desconto e de ", valorDesconto)
print("O novo preco e de ", precoComDesconto)

