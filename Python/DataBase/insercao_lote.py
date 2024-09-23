import crudFilmes as crud
from datetime import date

lista = [
    ["ET", "120", str(date(1986,1,5))],
    ["Jomas", "200", str(date(2020,10,8))],
    ["Os caça fantasma", "150", str(date(1990,10,5))]
]


crud.insereAll(lista)

