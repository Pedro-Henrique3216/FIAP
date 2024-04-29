def mdc(a, b):
    i = 2
    divisores_a = []
    while(i <= a):
        if(a % i == 0):
            divisores_a.append(i)
        i += 1

    i = 2
    divisores_b = []
    while(i <= b):
        if(b % i == 0):
            divisores_b.append(i)
        i += 1
        

    divisores_comum = []
    for i in divisores_a:
        if(i in divisores_b):
            divisores_comum.append(i)

    mdc = divisores_comum[len(divisores_comum) - 1]
   

    return mdc 



print(mdc(150, 120))


