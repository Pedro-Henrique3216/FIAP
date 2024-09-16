import crudFilmes as crud
from datetime import date


crud.insert("Vingadores", "255", date.today())
crud.findAll()

crud.altera("Thor", 2)
crud.findAll()

crud.excluir(2)
crud.findAll()