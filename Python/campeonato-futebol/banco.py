import oracledb
import os

def get_conexao():
    return oracledb.connect(dsn="oracle.fiap.com.br/orcl", user=os.getenv("DB_USER_ORACLE"), password=os.getenv("DB_PASSWORD_ORACLE"))

def consulta_time(nome: str) -> dict:
    with get_conexao() as conn:
        with conn.cursor() as cursor:
            sql = "select id, nome, vitorias, empates, derrotas, gols_contra, gols_pro from t_time where nome = :nome"
            cursor.execute(sql, {"nome": nome})
            dado = cursor.fetchone()
            if not dado:
                return None
            else:
                return {"id": dado[0], "nome": dado[1], "vitorias": dado[2], "empates": dado[3], "derrotas": dado[4], "gols_contra": dado[5], "gols_pro": dado[6]}

def insere_time(time: dict):
    with get_conexao() as conn:
        with conn.cursor() as cursor:
            sql = """insert into t_time(nome, vitorias, empates, derrotas, gols_contra, gols_pro) values 
            (:nome, :vitorias, :empates, :derrotas,
            :gols_contra, :gols_pro) returning id into :id"""
            id = cursor.var(oracledb.NUMBER)
            time["id"] = id
            cursor.execute(sql, time)
            time["id"] = time["id"].getvalue()[0]
        conn.commit()
        

         

def atualiza_time(time: dict):
    with get_conexao() as conn:
        with conn.cursor() as cursor:
            sql = """update t_time set vitorias = :vitorias, empates = :empates, derrotas = :derrotas, gols_contra = :gols_contra, gols_pro = :gols_pro where nome = :nome"""

            time = {"vitorias": time["vitorias"], "empates": time["empates"], "derrotas": time["derrotas"], "gols_contra": time["gols_contra"], "gols_pro": time["gols_pro"], "nome": time["nome"]}
            cursor.execute(sql, time)
        conn.commit()

def insere_partida(partida: dict):
    with get_conexao() as conn:
        with conn.cursor() as cursor:
            sql = """insert into t_partida(id_casa, id_visi, gols_visi, gols_casa, rodada) values
            (:casa, :visit, :gv, :gc, :rodada)"""

            cursor.execute(sql, partida)
        conn.commit()

def recupera_times() -> list:
    with get_conexao() as conn:
        with conn.cursor() as cursor:
            sql = """select * from t_time"""
            cursor.execute(sql)
            return cursor.fetchmany()

