show databases;
show variables like 'boardservice10';
create database db01;
drop database db01;
drop database if exists db01;
use boardservice10;

insert into db01(mno, mname, mcount) values (3,'test',2);

show tables; #모든 테이블 보기
select * from board; #지정해서 테이블 보기
