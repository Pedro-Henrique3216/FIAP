""" Dados um montante em dinheiro inicial d, uma taxa de juros mensal j e um período de
tempo em meses t, escreva um algoritmo que calcula o valor final em dinheiro se d ficar
aplicado a taxa de juros j durante t meses. """

dinheiro = float(input("Informe seu dinheiro inicial: "))

juros_mensal = float(input("Digite a porcentagem de juros mensal: ")) / 100

quantidade_meses = int(input("Informe quantos meses você deixar aplicado: "))

i = 1



while(i <= quantidade_meses):
    dinheiro = dinheiro + dinheiro * juros_mensal
    i += 1

print(f"O valor final do seu dinheiro será de {dinheiro:.2f}")