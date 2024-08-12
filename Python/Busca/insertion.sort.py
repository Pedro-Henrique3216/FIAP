def insere_ordenado(lista: list):
    pos = len(lista) - 1
    x = lista[pos]
    while pos > 0 and x < lista[pos-1]:
        lista[pos] = lista[pos -1]
        pos -= 1
    lista[pos] = x

lista = [2, 6, 10, 10, 15, 18, 35, 42, 12]
print(lista)
insere_ordenado(lista)
print(lista)
    