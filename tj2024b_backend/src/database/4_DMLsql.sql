

#테이블 : 표(행과 열로 이루어진 집합)
#속성/필드 : 세로단위 제목
#레코드/튜플 : 가로단위 자료
#1. 데이터베이스 생성
drop database if exists mydb0102;   # -- 데이터베이스 삭제
create database mydb0102;			# -- 데이터베이스 생성
use mydb0102;						# -- 데이터베이스 활성화
# 2. 테이블 생성
create table table1(
	mno int auto_increment,
    mname varchar(30) not null unique ,
    mcount int,
	constraint primary key(mno)
);

# DML : 데이터베이스 조작어
# 1. insert 2. select 3. update 4. delete
#		[c]		[r]			[u]		[d]

# [1] insert : 레코드 (행/튜플/) 삽입
# insert into 테이블명(속성명1, 속성명2) values(값1 , 값2)
insert into table1( mname, mcount) values('박명수' , 10);
insert into table1( mcount, mname) values(20 , '유재석');# mname속성에 제액조건이 unique를 넣었으므로 중복 삽입 불가능하다.
#insert into table1(mcount) values (30); # mname 속성에 제약조건이 not null 이므로 삽입시 값을 대입해야한다.
# mno를 생략하면 auto_increment 이므로 자동번호가 부여된다. 다만 직접 넣어도 됨
insert into table1(mno , mname, mcount) value(3, '강호동', 30);
# 테이블의 모든 속성들을 순서대로 초기값 대입할 경우 속성명은 생략해도 된다.
insert into table1 values (4, '신동엽', 40);
#insert 에 여러개 레코드 삽입하기
insert into table1 values (5, '서장훈' , 50), (6, '하하', 60);

#[2] select : 레코드(행/튜플) 조회
#1. 전체 속성의 레코드 조회 : select * from 테이블명;  필드는 3개 , 레코드는 2개     ,*[와일드카드/ 전체를 뜻함] 모든 속성명을 뜻함 
select * from table1;
#2. 특정 속성의 레코드 조회 : select 속성명1 from 테이블명; , 속성명이 2개 이상일 때   ,(쉼표)로 구분한다.
select mno from table1;
select mno, mname from table1;
select mno, mname , mcount from table1;
# 3. 레코드 조회 할때 속성값 조건 , [조건절]where 속성명 = 조건값; , 속성명 연산자 값
select * from table1 where mname = '유재석';					# mname 속성 값이 '유재석'인 레코드 조회
select * from table1 where mno = 3;							# mno 속성값이 3인 레코드 조회

#[3] update : 레코드의 속성 값 수정 
#1. 전체 레코드의 속성값 수정 : update 테이블명 set 속성명 = 새로운값
update table1 set mcount = 0;	#오류 : mysql workbench safe mode 끄기 : 
set SQL_SAFE_UPDATES = 0; #safe mode 끄기
set SQL_SAFE_UPDATES = 1; #safe mode 사용, 
#2. 특정 레코드의 속성값 수정 : update 테이블명 set 속성명 = 새로운값 wgere [조건절]
update table1 set mcount = 100 where mname = '유재석'; # mname속성값이 '유재석'인 레코드의 mcount를 100으로 수정
#3. 여러 속성값 수정 ,(쉼표)로 구분		: update 테이블명 set 속성명1 = 새로운값, 속성명2 = 새로운값
update table1 set mname = '강호동2' , mcount = 200 where mno = 3; # mno 속성값이 3인 레코드의 mname과mcount 값을 수정한다. 

#[4]delete : 레코드 삭제
# 1. 전체 레코드 삭제 : delete from 테이블명;
delete from table1;

# 2. 특정 레코드의 삭제 : delete from 테이블명 where [조건절]
delete from table1 where mno =3;
