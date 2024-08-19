def bubble_sort(lista:list):
   
    for i in range(len(lista)):
        pos = len(lista) - 1
        aux = lista[pos]

        while pos != i:
            if(lista[pos - 1] > aux):
                lista[pos] = lista[pos - 1]
                lista[pos - 1] = aux
                pos -= 1
            else:
                aux = lista[pos - 1]
                pos -= 1

            
lista = [10, 7, 13, 15, 23, 70, 14, 7, 25, 1]
bubble_sort(lista)
print(lista)

lista = ['Bruno', 'Hugo', 'Daniel', 'Paula', 'Nina', 'Isabela', 'Maria', 'Carla']
bubble_sort(lista)
print(lista)