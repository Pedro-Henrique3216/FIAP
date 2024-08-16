def ordena_lista_reverse(lista:list):
    outra_lista = []
    length = len(lista)
    for i in range(length):
        maior_numero = lista[0]
        for j in lista:
            if(maior_numero < j):
                maior_numero = j
        outra_lista.append(maior_numero)
        lista.remove(maior_numero)
    return outra_lista

lista = [3, 13, 9, 22, 11, 8, 804, 484, 2123, 45684,21]
print(ordena_lista_reverse(lista))    