import random

lojas = ["Centro", "Jardins", ""]

produtos = [
    {}
    ]

marcas = ["Dell", "Samsung"]
lojas = ["Magazine Luiza", "Casas Bahia", "Amazon"]
datas = ["2024-10-21", "2024-10-22"]
valores_unitarios = [3500.00, 2000.00]

def criar_data(data_criadas):
    data = ""
    while data == "" or data in data_criadas:
        dia = random.randint(1, 30)
        mes = random.randint(1, 12)
        if mes == 2 and dia > 28:
            dia = random.randint(1, 28)
        data = f"{dia}/{mes}/2022"
    data_criadas.append(data)
    return data

datas_geradas = []

with open("ex1.csv", mode="w", encoding="utf-8") as f:
    for i in range(5000):
        data_venda = criar_data(datas_geradas)
        print(data_venda)
        f.write(data_venda + "\n")
    f.close