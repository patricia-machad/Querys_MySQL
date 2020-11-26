create database db_relacionamentoH;
use db_relacionamentoH;

create table funcionario(
id int not null auto_increment primary key,
nome varchar (255),
cadastro  datetime default current_timestamp,
sexo char,
salario double 
);
insert into funcionario (id, nome, cadastro, sexo, salario) values
(1, 'Patricia', default, 'F', 3.500),
(2, 'Lucas', default , 'M', 2.200),
(3, 'Camila', default , 'F',  2.100),
(4, 'Marcelo', default, 'M', 1.050),
(5, 'Maria', default, 'F', 2.300);

select * from funcionario 
where salario > 2000;

select * from funcionario 
where salario < 2000;


update funcionario 
set salario = 2.000
where id = 4;



