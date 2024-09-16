import oracledb
import datetime
import os

url = "oracle.fiap.com.br/orcl"
user = os.environ["DB_USER_ORACLE"]
senha = os.environ["DB_PASSWORD_ORACLE"]

conn = oracledb.connect(dsn = url, user = user, password = senha)

cur = conn.cursor()

rows = cur.execute("""
                        insert into empregado(NOME, CARGO, SALARIO, DATA_CONTRATACAO) values(:nome, :cargo, :sal, to_date(:data, 'YYYY-MM-DD'))
                   """, {"nome": "Pedro", "cargo": "Medico", "sal": 8000, "data": datetime.date.today()})

conn.commit()
cur.close()
conn.close()