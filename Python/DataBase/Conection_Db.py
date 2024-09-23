import oracledb
import os

def retorna_conexao ():
    dsn = "oracle.fiap.com.br/orcl"
    user = os.environ["DB_USER_ORACLE"]
    password = os.environ["DB_PASSWORD_ORACLE"]
    return oracledb.connect(user=user, password=password, dsn=dsn)

if __name__ == "__main__":
    conn = retorna_conexao()
    print("Database versio:", conn.version)

    cur = conn.cursor()
    cur.execute("select * from T_MENSAGEM")

    # rows = cur.fetchall()
    # for reg in rows:
    #     print(reg)

    while True:
        regs = cur.fetchmany()
        if not regs:
            break
        for reg in regs:
            print(reg)

    cur.execute("INSERT INTO T_MENSAGEM(ID, MENSAGEM) VALUES(:id, :mensagem)", {"id": 4, "mensagem": "Nós estamos bem"})

    conn.commit()

    cur.execute("select * from T_MENSAGEM")
    rows = cur.fetchall()
    for reg in rows:
        print(reg)

    cur.execute("UPDATE T_MENSAGEM SET MENSAGEM = :mensagem WHERE id = :id" , { "mensagem": "como voces estão", "id": 3})

    conn.commit()

    cur.execute("select * from T_MENSAGEM")
    rows = cur.fetchall()
    for reg in rows:
        print(reg)

    cur.close()
    conn.close()