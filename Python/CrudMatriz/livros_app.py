import arquivo

def cadastra(conj: list) -> None:
    tit = input("Informe o titulo: ")
    cat = input("Informe a categoria: ")
    sin = input("Informe a sinopse: ")
    aut = input("Informe o autor: ")
    edi = input("Informe a editora: ")
    prc = float(input("Informe o preco: "))
    livro = [tit, cat, sin, aut, edi, prc]
    conj.append(livro)


def consulta(conj : list) -> None:
    resultado = []
    cat = input("Informe a categoria: ")
    for i in range(len(conj)):
        if conj[i][1] == cat:
            resultado.append(conj[i])
    
    if len(resultado) == 0:
        print("Nenhum livro cadastrado com essa categoria")
    else :     
        for livro in resultado:
            print(livro)
    
def busca(conj : list, titulo: str):
    for i in range(len(conj)):
        if conj[i][0] == titulo:
            return i
    return - 1
    

def altera(conj: list):
    tit = input("Informe o titulo do livro que deseja busca: ")
    pos = busca(conj, tit)
    if pos == -1:
        print("livro não encontrado")
    else:
        rotulos = ["titulo", "categoria", "sinopse", "autor", "editora", "preço"]
        for i in len(rotulos):
            aux = input(f"{rotulos[i]} ({conj[pos][i]}): ")
            if len(aux) > 0:
                if rotulos[i] == "preço":
                    conj[pos][i] = float(aux)
                conj[pos][i] = aux

def exclui(conj: list):
    tit = input("informe o livro que deseja excluir")
    pos = busca(conj, tit)
    if pos == -1:
        print("Não há livro com esse titulo")
    else:
        print(conj[pos])
        print("Livro excluido com sucesso")
        conj.pop(pos)

try:
    estoque = arquivo.ler_arquivo("estoque.csv")
except Exception:
    estoque = []
estoque.append(["cinderela", "animação", "histora sobra", "walt disney", "disney", 5])
opcao = 0

while opcao != 5:
    print("     SISTEMA DE LIVRARIA     ")
    print("1 - cadastra")
    print("2 - consulta")
    print("3 - altera")
    print("4 - exclui")
    print("5 - sair")
    try:
        opcao = int(input("Escolha uma opção: "))
    except Exception:
        print("Opção invalida")
        opcao = 0

    if opcao == 1:
        cadastra(estoque)
    elif opcao == 2:
        consulta(estoque)
    elif opcao == 3:
        altera(estoque)
    elif opcao == 4:
        exclui(estoque)
    elif opcao == 5:
        arquivo.gravar_arquivo(estoque, "estoque.csv")
        