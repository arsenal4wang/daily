use wang;
drop table if exists test1;
create table test1(
id int not null auto_increment,
name varchar(10),
primary key (id)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;

insert into test1(name) values('wang');
insert into test1(name) values('wang');
insert into test1(name) values('wang');
insert into test1(name) values('wang');
insert into test1(name) values('wang');
insert into test1(name) values('wang');
insert into test1(name) values('wang');
insert into test1(name) values('wang');
insert into test1(name) values('wang');
insert into test1(name) values('wang');
insert into test1(name) values('wang');
insert into test1(name) values('wang');

select * from test1 limit 2,4;
