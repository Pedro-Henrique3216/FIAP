def sortear_tuple(v: list):
    for i in range(1, len(v)):
        x = v[i]
        while v[i - 1] > x and i > 0:
            v[i] = v[i - 1] 
            i -= 1
        v[i] = x

if __name__ == "__main__":
    pessoas = [('Andre', 18), ('Thiago', 23), ('Soraia', 22), ('Mateus', 16), ('Bernardo', 23), ('Cibele', 17), ('Oscar', 18), ('Thiago', 15), ('Cintia', 16), ('Daniela', 15), ('Mario', 18), ('Soraia', 16), ('Lais', 16), ('Cintia', 20), ('Mario', 22)]
    sortear_tuple(pessoas)
    print(pessoas)