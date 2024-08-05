import time

def busca(conjunto: list, valor: float) -> int:
    for i in range(len(conjunto)):
        if(conjunto[i] == valor):
            return i
    return -1    
lista = [-5.6, 0.9, 3.6, 2.0]
x = 3.6

resp = busca(lista, x)
print(resp)

def outra_busca(conjunto:list, valor:float) -> int:
    if(valor in conjunto):
        return conjunto.index(valor)
    return -1


resp = outra_busca(lista, x)
print(resp)

lista = [0] * 100_000_000
x = 100_000
for i in range(len(lista)):
    lista[i] = i

t_ini = time.time()
resp = busca(lista, x)
t_fim = time.time()
print(t_fim - t_ini)
print(resp)
t_ini = time.time()
resp = outra_busca(lista, x)
t_fim = time.time()
print(t_fim - t_ini)
print(resp)