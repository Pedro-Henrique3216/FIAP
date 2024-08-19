def ordena_lista(lista:list):
    outra_lista = []
    length = len(lista)
    for i in range(length):
        menor_numero = lista[0]
        for j in lista:
            if(menor_numero > j):
                menor_numero = j
        outra_lista.append(menor_numero)
        lista.remove(menor_numero)
    return outra_lista

if __name__ == "__main__":
    lista = [3, 13, 9, 22, 11, 8, 804, 484, 2123, 45684,21]
    print(ordena_lista(lista))    

    lista2 = ["Pedro", "Arthur", "Jonas", "Thiago", "Caio"]
    print(ordena_lista(lista2))