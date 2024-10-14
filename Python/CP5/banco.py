import oracledb
import os

def get_conexao() -> oracledb.Connection:
    return oracledb.connect(dsn="oracle.fiap.com.br/orcl", user=os.getenv("DB_USER_ORACLE"), password=os.getenv("DB_PASSWORD_ORACLE"))


def inclui(mensagem: dict) -> None:
    sql = """
            insert into mensagens(assunto, destinatario, remetente, conteudo) values(:assunto, :destinatario, :remetente, :conteudo)
        """
    with get_conexao() as conn:
        with conn.cursor() as cursor:
            cursor.execute(sql, mensagem)
        conn.commit()


def altera(mensagem: dict) -> None:
    sql = """
            update mensagens set assunto = :assunto, destinatario = :destinatario, remetente = :remetente, conteudo = :conteudo where id = :id
        """
    
    with get_conexao() as conn:
        with conn.cursor() as cursor:
            cursor.execute(sql, mensagem)
        conn.commit()

def recupera(id: int) -> dict:
    sql = """
            select * from mensagens where id = :id
        """
    with get_conexao() as conn:
        with conn.cursor() as cursor:
            cursor.execute(sql, {"id": id})
            row = cursor.fetchone()
            if row is None:
                return "Não existe pessoa com esse id"
            id, assunto, destinatario, remetente, conteudo = row
            return {"id": id, "assunto": assunto, "destinatario": destinatario, "remetente": remetente, "conteudo": conteudo}

def recupera_assunto(assunto: str) -> list:
    sql = """
            select * from mensagens where assunto like :assunto
        """
    with get_conexao() as conn:
        with conn.cursor() as cursor:
            cursor.execute(sql, {"assunto": f'%{assunto}%'})
            lista = []

            while True:
                row = cursor.fetchone()
                if row == None:
                    break
                lista.append(row)

            for i in range(len(lista)):
                id, assunto, destinatario, remetente, conteudo = lista[i]
                lista[i] = {"id": id, "assunto": assunto, "destinatario": destinatario, "remetente": remetente, "conteudo": conteudo}
            
            return lista


def recupera_destinatario(destinatario: str) -> list:
    sql = """
            select * from mensagens where destinatario = :destinatario
        """
    with get_conexao() as conn:
        with conn.cursor() as cursor:
            cursor.execute(sql, {"destinatario": destinatario})
            lista = []

            while True:
                row = cursor.fetchone()
                if row is None:
                    break
                lista.append(row)

            for i in range(len(lista)):
                id, assunto, destinatario, remetente, conteudo = lista[i]
                lista[i] = {"id": id, "assunto": assunto, "destinatario": destinatario, "remetente": remetente, "conteudo": conteudo}
            
            return lista

def apaga(id: int):
    sql = """
            delete from mensagens where id = :id
        """
    with get_conexao() as conn:
        with conn.cursor() as cursor:
            cursor.execute(sql, {"id": id})
        conn.commit()