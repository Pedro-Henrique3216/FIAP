import time 
import ex2
import exemplo
import random

lista = [1, 5, 10, 23, 50, 13, 35, 15, 3]

for i in range(10000):
    n = random.randint(0, 10)
    lista.append(n)


l1 = lista.copy()
l2 = lista.copy()
t_init = time.time()
# print(ex2.ordena_lista(lista))
ex2.ordena_lista(l1)
t_fim = time.time()

diferenca_selection_sort = t_fim - t_init

t_init = time.time()
exemplo.insertion_sort(l2)
# print(list2)
t_fim = time.time()

diferenca_insertion_sort = t_fim - t_init

print(diferenca_selection_sort)
print(diferenca_insertion_sort)
