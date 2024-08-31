create table T_RHSTU_MEDICO_CONTATO(
cd_medico number,
id_contato number(3),
tp_contato varchar2(30) not null,
ds_contato varchar2(40) not null,
st_contato varchar2(1) not null,

constraint ck_tp_contato
check (tp_contato in ('Telefone Celular', 'Telefone Fixo', 'email', 'Telefone Contato')),

constraint ck_st_contato
check (st_contato in ('A', 'I')),

primary key(cd_medico, id_contato),

constraint fk_RHSTU_MEDICO_CONTATO_MEDICO foreign key (cd_medico) references T_RHSTU_MEDICO(cd_medico) 
);

SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, SEARCH_CONDITION
FROM USER_CONSTRAINTS
where table_name = 'T_RHSTU_MEDICO_CONTATO';

alter table T_RHSTU_MEDICO_CONTATO
modify tp_contato varchar2(50);

desc T_RHSTU_MEDICO_CONTATO;

alter table T_RHSTU_MEDICO_CONTATO add dt_cadastro DATE;

desc T_RHSTU_MEDICO_CONTATO;

alter table T_RHSTU_MEDICO_CONTATO modify dt_cadastro not null;

desc T_RHSTU_MEDICO_CONTATO;

alter table T_RHSTU_MEDICO_CONTATO drop column dt_cadastro;

desc T_RHSTU_MEDICO_CONTATO;

insert into T_RHSTU_MEDICO values(1, 'Pedro', 123456, 'ORTOPEDISTA');

insert into T_RHSTU_MEDICO_CONTATO values(1, 1, 'Telefone Celular', 'meu telefone', 'A');

insert into T_RHSTU_MEDICO_CONTATO values(1, 2, 'Telefone Celular', 'meu telefone', 'A');

select * from T_RHSTU_MEDICO;
select * from T_RHSTU_MEDICO_CONTATO;




