
/* 여러줄 주석*/
# 한줄주석
-- 한줄주석

/*
1. SQL 코드 작성방법
	1. SQL 문법을 작성한다.
    2. SQL 문장이 끝나면 ;(세미콜론)으로 마친다.

2.SQL 코드 실행방법
	방법1: 단위실행
			1. alter 코드에 커서를 두고 CTRL + ENTER or (번개I아이콘) 클릭 :
            
	
	방법2 : 현재 파일내 모든 코드실행(위에서 아래순으로)
		1. CTRL + SHIFT + ENTER
        2. (번개아이콘)클릭시 전체 다 실행
3. SQL 코드 실행 결과
	- 하단에 Result Grid 탭에서 확인이 가능하다

*/
#[1] db server 내 모든 데이터베이스 확인
# 데이터베이스란? 데이터집합, 표/테이블들을 모아둔 곳
show databases;


#[2] db server의 local path 확인
show variables like 'datadir';



# [3] dbserver의 데이터 베이스 생성하기.
# create database DB명
create database mydb1226;

#[4] db server의 데이터베이스 삭제하기
#drop database 삭제할DB명
drop database mydb1226;

#[4-1] 만약에 지정한 데이터베이스가 존재 하면 삭제하기
#
drop database if exists mydb1226;

#[5] db server 내 여러개 데이터베이스 중에 사용/활성화 할 데이터베이스 선택
use mydb1226;

# 실습1 : 아래와 같이 순서대로 SQL코드를 작성하고 실행하시오

drop database if exists test1;   # 안전하게 오류메세지가아닌 경고메세지로 되기때문에 지울때 주로 사용
create database test1;
show databases;
show variables like 'detadiar';
use test1;


#참고 : 현재 작성한 코드 파일을 sql확장자 파일 , ctrl+s