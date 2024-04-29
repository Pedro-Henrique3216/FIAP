def mmc(a, b):
    i = b
    while(i % a != 0):
        i += b

    return i
print(mmc(5, 21))
