create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_pizza(
id int not null auto_increment primary key,
sabor varchar(255),
tamanho varchar(255),
valor double(7,2),
id_categorias int ,
foreign key (id_categorias) references tb_categorias (id)
);

create table tb_categorias(
id integer primary key auto_increment,
tipo varchar(255)
);

insert into tb_categorias values
(default, 'Salgada'),
(default, 'Doce'),
(default, 'Vegana');

insert into tb_pizza values
(default, 'Calabresa', 'Grande', '60.00', 1),
(default, 'Mussarela', 'Media', '38.00', 1),
(default, 'Frango com Catupiry', 'Pequena', '20.00', 1),
(default, '4 queijos', 'Grande', '62.00', 1),
(default, 'Brocolis', 'Pequena', '22.00', 3),
(default, 'Atum', 'Grande', '66.00', 3),
(default, 'Glutem Free', 'Grande', '60.00', 3),
(default, 'Brigadeiro', 'Media', '40.00', 2);

select * from tb_pizza;

select * from tb_categorias;

select * from tb_pizza where valor >=45.00;

select * from tb_pizza inner join tb_categorias where tb_pizza.id_categorias = tb_categorias.id;

select * from tb_pizza right join tb_categorias on tb_pizza.id_categorias = tb_categorias.id where tb_categorias.id = 3;
