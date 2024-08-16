def esta_ordenado(lista:list) -> bool:
    for i in range(len(lista) - 1):
        if(lista[i] > lista[i + 1]):
            return False
    return True
lista = [1, 2, 3, 5, 7, 20, 11]
print(esta_ordenado(lista))

