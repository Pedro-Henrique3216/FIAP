# Transforme os seguintes numeros de binario para decimal:
# 101011, 10110 e 10001

numero1 = 101011

numero2 = 10110

numero3 = 10001

i1 = 1
sum1 = 0
while numero1 != 0:
    dig = numero1 % 10
    numero1 = numero1 // 10
    if(dig != 0):
        sum1 += i1
    i1 += i1

i2 = 1
sum2 = 0
while numero2 != 0:
    dig = numero2 % 10
    numero2 = numero2 // 10
    if(dig != 0):
        sum2 += i2
    i2 += i2


i3 = 1
sum3 = 0
while numero3 != 0:
    dig = numero3 % 10
    numero3 = numero3 // 10
    if(dig != 0):
        sum3 += i3
    i3 += i3


print(sum1, sum2, sum3)
    