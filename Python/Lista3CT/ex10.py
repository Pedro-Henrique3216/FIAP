""" Escreva um algoritmo que recebe um inteiro positivo n e calcula n! = 1 · 2 · 3 . . . ·(n − 1)· n.
Por exemplo, se n = 6, então 6! = 1 · 2 · 3 · 4 · 5 · 6 = 720. """

numero_fatorial = int(input("Digite um numero inteiro para fotarar: "))

i = 2
fatorar = 1
while(i <= numero_fatorial):
    fatorar *= i
    i += 1

print(fatorar)
