import random

def gerar_DDD():
    num = random.randint(11, 86)
    return f"({num})"

def geraTelefone():
    num = random.randint(1000000, 9999999)
    return f"9{num}"

pessoas = ["Ana", "Bia", "Sergio", "Edu"]
sobrenome = ["Silva", "Alburquerque", "Lope", "Gonçalvez"]


with open("cadastro.txt", mode="w", encoding="utf-8") as arq:
    for i in range(1000):
        x = random.choice(pessoas)
        y = random.choice(sobrenome)
        arq.write(f"{x} {y}; {gerar_DDD()} {geraTelefone()} \n")
