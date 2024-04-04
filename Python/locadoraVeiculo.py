opcao = 0
while opcao != 5:
    print("\nSistema de locação\n")

    print("1 - alugar veiculo")
    print("2 - devolução veiculo")
    print("3 - cadastrar veiculo")
    print("4 - consultar veiculo disponivel")
    print("5 - sair\n")
    opcao = int(input("Digite a opção desejada: "))
    
    if(opcao == 1):
        marca = input("Digite a marca do veiculo: ")
        ano = int(input("Digite o ano do carro: "))

        if(marca != "" and ano > 1900):
            print("Carro alugado")
        else:
            print("Carro não alugado")

        print("\nVoltando para o menu")
        opcao = 0;  
    
        
    elif(opcao == 2):
        pass

    elif(opcao == 3):
        nome = input("DIgite seu nome: ")
        cpf = int(input("Digite seu cpf: "))
        nascimento = int(input("digite seu ano de nascimento: "))
        habilitacao = int(input("Digite os numero de sua CNH: "))

        if(nascimento < 2014):
            print("Cadastro efetuado com sucesso!")
        else:
            print("Cliente não cadastrado")
        print("\nVoltando para o menu")
        opcao = 0
    elif(opcao == 4 ):
        tipo = input("Informe o tipo do carro (Hath, Sedã, Suv): ")
        print("Carros disponiveis:")
        print("Ônix 2022 Turbo - 180,00")
        print("Polo 2020 1.6 - 200,00")
        print("Mobi 2023 1.0 - 140,00") 
    elif(opcao == 5):
        print("Obrigado por usar nosso sistema!")
    else:
        print("\nOpção invalida")
        