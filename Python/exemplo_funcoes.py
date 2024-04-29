def aumento(valor, percentual):
    valor += valor * percentual / 100
    return valor

def divisao_resto(a, b):
    return (a // b, a % b)

vl = 1000
perc = 25

print(aumento(vl, perc))

aux = aumento(400_000, 0.5)
print(aux)

print(divisao_resto(34, 7))