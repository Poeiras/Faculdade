/*
create table deposito(
	codigo_deposito int primary key,
	endereco_deposito varchar(20)
)
insert into deposito values (100, 'rua legal 10')
insert into deposito values (101, 'rua chata 20')
insert into deposito values (102, 'rua normal 30')
insert into deposito values (103, 'rua da amizade 40')
*/

/*
update deposito
set endereco_deposito = 'rua lucas 102'
where codigo_deposito = 100;
*/

/*
delete deposito 
where codigo_deposito = 101;
*/

/*
create table conjuntoA(
cod_fruta_A int,
nome_fruta_A varchar(20));

insert into conjuntoA values(1, 'banana');
insert into conjuntoA values(2, 'mamao');
insert into conjuntoA values(3, 'morango');

select * from conjuntoA;

create table conjuntoB(
cod_fruta_B int,
nome_fruta_B varchar(20));

insert into conjuntoB values(1, 'banana');
insert into conjuntoB values(2, 'melancia');
insert into conjuntoB values(30, 'abacaxi');

select * from conjuntoB;
*/

/*
select cod_fruta_A, nome_fruta_A from conjuntoA
union all
select cod_fruta_B, nome_fruta_B from conjuntoB
*/

/*
select cod_fruta_A, nome_fruta_A from conjuntoA
intersect
select cod_fruta_B, nome_fruta_B from conjuntoB
*/

select cod_fruta_B, nome_fruta_B from conjuntoB
minus
select cod_fruta_A, nome_fruta_A from conjuntoA