from exemplo_busca_simples import busca

def elimina_repetidos(vetor):
    retorno = []
    for valor in vetor:
        if busca(retorno, valor) == -1:
            retorno.append(valor)

    return retorno


lista = [2, 0, -5, 7, 8, 10, 4, -2, 2, 7, 0, 3]
resultado = elimina_repetidos(lista)
print(resultado)