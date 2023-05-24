create database dbaulas

create table aluno
(
    id number (5) primary key,
    nome varchar(20) not null,
    cod_turma number(2)
);

create table turma
(
    cod_turma number(2) primary key,
    descritivo_turma varchar2(20)
);