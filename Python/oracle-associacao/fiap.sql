CREATE TABLE T_CLIENTE 
   ("ID" NUMBER GENERATED BY DEFAULT AS IDENTITY, 
	"NOME" VARCHAR2(100 BYTE), 
	"DOCUMENTO" VARCHAR2(30 BYTE), 
	"EMAIL" VARCHAR2(50 BYTE), 
	 PRIMARY KEY ("ID")
);

CREATE TABLE T_VENDA 
   ("ID" NUMBER GENERATED BY DEFAULT AS IDENTITY,
	"VALOR" NUMBER(8,2), 
	"DATA" DATE, 
	"ID_CLIENTE" NUMBER,
    primary key(id),
	 FOREIGN KEY ("ID_CLIENTE")REFERENCES T_CLIENTE("ID")
     );

create table t_itemvenda(
    id number generated by default as identity,
    produto varchar2(200),
    quantidade number,
    valor number(8, 2),
    id_venda number,
    primary key(id),
    foreign key(id_venda) REFERENCES t_venda(id)
);
