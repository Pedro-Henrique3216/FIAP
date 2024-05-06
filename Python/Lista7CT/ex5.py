#Faça uma função em Python que recebe uma lista de números reais e retorna True se a lista
#está ordenada em ordem crescente ou False se ela não está.

def ordem_crescente(lista):
    new_lista = []
    new_lista += lista
    lista_ordem_crescente = []

    
    while 0 < len(new_lista):
        menor = new_lista[0]
        for n in new_lista:
            if(menor > n):
                menor = n
        
        lista_ordem_crescente.append(menor)
        new_lista.remove(menor)

    if(lista_ordem_crescente == lista):
        return True
    
    return False


lista = [3, 4, 7, 8, 9, 10, 13, 11, 18]
print(ordem_crescente(lista))


lista = [3, 4, 5, 6, 7, 8, 9]
print(ordem_crescente(lista))

        