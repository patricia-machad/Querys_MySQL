use test;
create table tabela_logs (
id int,
data_operacao datetime default CURRENT_TIMESTAMP,
hora time
);

insert into tabela_logs values(1, default, "10:00");
select * from tabela_logs;