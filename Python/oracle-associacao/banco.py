import oracledb
import os

def get_conexao():
    return oracledb.connect(user=os.getenv("DB_USER_ORACLE"), password=os.getenv("DB_PASSWORD_ORACLE"),
                        dsn='oracle.fiap.com.br/orcl')

def recupera_cliente_documento(doc: str):
    sql = '''select id, nome, email, documento from t_cliente 
                where documento=:doc'''
    with get_conexao() as con:
        with con.cursor() as cur:
            cur.execute(sql, {'doc': doc})
            return cur.fetchone()

def insere_cliente(cli: dict):
    sql = '''insert into t_cliente(nome, email, documento) 
            values(:nome, :email, :documento) returning id into :id'''
    with get_conexao() as con:
        with con.cursor() as cur:
            novo_id = cur.var(oracledb.NUMBER)
            #print(cli)
            cli['id'] = novo_id
            cur.execute(sql, cli)
            #print(novo_id)
            
            cli['id'] = novo_id.getvalue()[0]

        con.commit()

if __name__ == "__main__":

    cliente = {'nome': '1TDSPJ', 'email': 'compras@1tdspj.com.br',
                'documento': '876.902.987-76'}
    insere_cliente(cliente)
    print(cliente)






