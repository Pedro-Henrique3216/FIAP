def indica_encontrados(vetor: list, valor :int) -> list:
    result = []
    for n in range(len(vetor)):
        if(vetor[n] == valor):
         result.append(n)

    return result

vetor = [0, 1, 6, 6, 7, 8, 6]
print(indica_encontrados(vetor, 6))