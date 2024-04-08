# Transforme os seguintes numeros de decimal para binario:
# 238, 1043 e 4502


num1 = 238

num2 = 1043

num3 = 4502

binario = ""
while num1 != 0:
    dig = num1 % 2
    num1 = num1 // 2

    binario += str(dig)

print(binario[::-1])

binario = ""
while num2 != 0:
    dig = num2 % 2
    num2 = num2 // 2

    binario += str(dig)

print(binario[::-1])

binario = ""
while num3 != 0:
    dig = num3 % 2
    num3 = num3 // 2

    binario += str(dig)

print(binario[::-1])