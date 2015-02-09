use wang;
drop table if exists test;
create table test(
id int not null auto_increment,
name varchar(10),
primary key (id)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;

insert into test(name) values('wang');

select * from user limit 2,6;

