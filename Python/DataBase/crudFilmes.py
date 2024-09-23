import Conection_Db as cdb

def insert(nome, duracao, data):
    with cdb.retorna_conexao() as conn:
        sql = """
            insert into filme(nome, duracao_minutos, data_estreia) 
            values(:nome, :duracao, to_date(:data, 'yyyy-mm-dd'))
        """
    
        insere = {"nome": nome, "duracao": duracao, "data": data}

        with conn.cursor() as cur:
            cur.execute(sql, insere)
            conn.commit()

def findAll():
    with cdb.retorna_conexao() as conn:
        sql = """
            select * from filme
        """
        with conn.cursor() as cur:
            rows = cur.execute(sql)
            while True:
                regs = rows.fetchmany()
                if not regs:
                    break
                for reg in regs:
                    print(reg)

def altera(nome, id):
    with cdb.retorna_conexao() as conn:
        sql = """
            update filme set nome = :nome where id = :id
        """

        insere = {"nome": nome, "id": id}
        with conn.cursor() as cur:
            cur.execute(sql, insere)
            conn.commit()

def excluir(id):
    with cdb.retorna_conexao() as conn:
        sql = """
            delete filme where id = :id
        """
        insere = {"id": id}
        with conn.cursor() as cur:
            cur.execute(sql, insere)
            conn.commit()
            
def insereAll(lista: list):
    with cdb.retorna_conexao() as conn:
        for filme in lista:
            insert(filme[0], filme[1], filme[2])

            