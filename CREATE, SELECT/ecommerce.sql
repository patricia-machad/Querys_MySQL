create database comercio;
use comercio;

create table produtos (
id int not null auto_increment primary key,
nome varchar (255),
valor double(7,2),
quantidade int,
datacadastramento datetime default current_timestamp 
);
insert into produtos (id, nome, valor, quantidade, datacadastramento) values
(1, 'HeadSet', 220.00, 15, default),
(2, 'Colchao', 750.00, 10, default),
(3, 'Tenis', 120.00, 20, default),
(4, 'Microondas', 450.00, 10, default),
(5, 'EveryDay-livro', 30.00, 5, default),
(6, 'Rexona', 17.00, 20, default),
(7, 'Conjunto de jantar', 100.00, 15, default),
(8, 'Pipoca', 4.00, 50, default);

select * from produtos 
where valor > 300;

select * from produtos 
where valor < 300;

update produtos 
set nome = 'EveryDay-livro'
where id = 5; 


