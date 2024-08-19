import time 
def ordenar_tuplas(lista: list):
    for i in range(len(lista)):
        pos = len(lista) - 1
        aux = lista[pos]

        while pos != i:
            if(lista[pos - 1][0] > aux[0]):
                lista[pos] = lista[pos - 1]
                lista[pos - 1] = aux
                pos -= 1
            elif lista[pos - 1][0] == aux[0]:
                if(lista[pos - 1][1] > aux[1]):
                    lista[pos] = lista[pos - 1]
                    lista[pos - 1] = aux
                    pos -= 1
                else:
                    aux = lista[pos - 1]
                    pos -= 1

            else:
                aux = lista[pos - 1]
                pos -= 1

def ordenacao2(lista, pos, crit):
    aux = lista[pos]
    while pos > 0 and lista[pos-1][crit] > aux[crit]:
        lista[pos] = lista[pos-1]
        pos = pos -1
    lista[pos] = aux


def insertions_sort(lista, crit):
    for i in range(len(lista)):
        ordenacao2(lista, i, crit)


if __name__ == "__main__":
    pessoas = [('Andre', 18), ('Thiago', 23), ('Soraia', 22), ('Mateus', 16), ('Bernardo', 23), ('Cibele', 17), ('Oscar', 18), ('Thiago', 15), ('Cintia', 16), ('Daniela', 15), ('Mario', 18), ('Soraia', 16), ('Lais', 16), ('Cintia', 20), ('Mario', 22)]
    t_init = time.time()
    ordenar_tuplas(pessoas)
    t_fim = time.time()
    diferenca_selection_sort = t_fim - t_init
    print(diferenca_selection_sort)

    pessoas = [('Andre', 18), ('Thiago', 23), ('Soraia', 22), ('Mateus', 16), ('Bernardo', 23), ('Cibele', 17), ('Oscar', 18), ('Thiago', 15), ('Cintia', 16), ('Daniela', 15), ('Mario', 18), ('Soraia', 16), ('Lais', 16), ('Cintia', 20), ('Mario', 22)]
    t_init = time.time()
    insertions_sort(pessoas, 1)
    insertions_sort(pessoas, 0)
    t_fim = time.time()
    diferenca_selection_sort = t_fim - t_init
    print(diferenca_selection_sort)
