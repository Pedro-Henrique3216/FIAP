def esta_ordenada(lista: list) -> bool:
    vetor = []
    for i in lista:
        menor_numero = i
        for j in lista:
            if(j < menor_numero and j not in vetor):
                menor_numero = j
        vetor.append(menor_numero)    
    
    return vetor == lista

def outra_verificacao(lista: list) -> bool:
    for i in range(len(lista) - 1):
        if(lista[i] > lista[i+1]):
            return False
    return True

l = [2, 5, 8, 9, 10, 11]
print(esta_ordenada(l))
print(outra_verificacao(l))

k = [9, 7, 4, 9, 10, 11]
print(esta_ordenada(k))
print(outra_verificacao(k))