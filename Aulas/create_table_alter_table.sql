create table funcionarios (
	id int not null auto_increment primary key,
	nome varchar(30) NOT  NULL, 
	nascimento date,
	sexo enum ('M','F', 'Outro'),
	peso decimal(5,2),
	altura decimal(3,2),
    dia_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	nacionalidade varchar(20) DEFAULT 'Brasil'
    );

#mostra id no fim
#COMANDOS DDL (DATA DEFINITION LANGUAGEM, CREATE, DROP, ALTES, RENAME)
#COMANDOS DDL (DATA DEFINITION LAGUAGEM, 1  ,2  ,3  , 4)

describe funcionarios;

alter table funcionarios modify column nome char (255);

alter table funcionarios add column historico char (50) after name;
alter table funcionarios add column historico char (50);
alter table funcionarios drop column historico;

rename table funcionarios to colaboradores;
show tables;