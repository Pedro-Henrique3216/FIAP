import oracledb
import os

url = "oracle.fiap.com.br/orcl"
user = os.environ["DB_USER_ORACLE"]
password = os.environ["DB_PASSWORD_ORACLE"]

conn = oracledb.connect(dsn = url, user = user, password = password)

cur = conn.cursor()

cur.execute("""
                update empregado set departamento = :dep, numero = :num
            """, {"dep": "ADM", "num": 1})

conn.commit()
cur.close()
conn.close()