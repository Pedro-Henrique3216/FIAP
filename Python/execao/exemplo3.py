try:
    a = int(input("A: "))
    b = int(input("B: "))
    c = a / b
except (ZeroDivisionError, ValueError) as e:
    if type(e) == ValueError:
        print("Erro de Valor")
    else:
        print("Erro de divisão")
    print("Erro", type(e))
else:
    print("Resultado:", c)