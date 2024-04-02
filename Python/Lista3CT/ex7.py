""" A conversão de graus Fahrenheit para centígrados é obtida pela fórmula C =5/9(F − 32).
Escreva um algoritmo que calcule e escreva uma tabela de graus centígrados em função de
graus Fahrenheit que variem de 50 a 150 Fahrenheit de 1 em 1 """

i = 50

while(i <= 150):
    celsius = (5 / 9) * (i - 32)
    print(f"Fahrenheit {i}° : Celsius {celsius:.2f}°")

    i += 1
