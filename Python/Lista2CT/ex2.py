num1 = int(input("Digite um numero inteiro: "))
num2 = int(input("Digite outro numero inteiro: "))

if(num1 > num2):
    print("{} e maior que {}".format(num1, num2))
elif(num2 > num1):
    print("{} e maior que {}".format(num2, num1))
else:
    print("Empate")
    