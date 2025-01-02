#SQL 과제1 : 키오스크 개발의 메모리 설계 하고 DB와 테이블 생성을 SQL로 작성하여 제출하시오.
/*
https://www.youtube.com/watch?v=ksuYwD1oC3A

위 링크와 같은 프로그램을 만들기 위한 DB설계
[요구사항]
1. 여러개 카테고리중에 카테고리를 선택해서 카테고리 별로 제품들을 출력/확인한다.
2. 해당제품을 선택해서 수량 입력받아 주문처리한다. 단, 하나의 주문의 여러개 제품을 주문 할 수 있다.
3. 주문번호를 받아서 대기한다.
4. 설계 조건
	1. [메모리 설계 필수 속성]
	- 식별자 코드 , 카테고리명, 가격 ,제품명, 주문수량, 주문날짜 하되 추가 가능합니다.
    2. 테이블간의 데이터 중복을 최소화한다.
    3. 총테이블은 3개 이상으로 설계한다.
    4. 적절한 타입과 제약 조건을 최대한 활용하시오.
    5. DB 명, 테이블명, 속성명은 임의로 합니다.
    
    
			PK 주문번호,카테고리 번호, 카테고리명, 카테고리 그림,
			
			FK 주문번호, 제품명, 주문 그림, 주문수량, 가격
			
			FK 핸드폰번호, 주문날짜, 쿠폰사용, 쿠폰적립, 

	PK 주문번호,카테고리 번호, 카테고리명, 카테고리 그림,
			
			FK 주문번호, 제품명, 주문 그림, 주문수량, 가격
			
			FK 핸드폰번호, 주문날짜, 쿠폰사용, 쿠폰적립, 
            
            1. 필요한 모든데이터 수집
				주문번호 , 카테고리명, 제품명, 가격 , 주문수량, 주문날짜
                
			2. 데이터간의 관계가 있는 테이블로 쪼개기/나누기 pk는 중복이 들어가면 안됨
				1.카테고리번호(제품명의 중복을 회피하기 위해서),카테고리        2.제품번호(제품명의 중복을 회피하기 위해서),제품명,가격        3.주문번호,주문수량,주문날짜
		
																	3-1. 주문상세 , 주문번호, 주문수량


    
*/




#과제1
create database kiosk; #[1]DB생성
use kiosk;			   #[2]DB사용 활성화
#주의할점은 테이블 생성시 상위PK 테이블 먼저 생성
#[4]카테고리 테이블
create table category(
	cno		int auto_increment, 	# 카테고리번호
    cname	varchar(30) not null, 	#카테고리명
    constraint primary key(cno) #pk필드 선정
    
);

#[5]제품테이블
create table product(
	pno		int auto_increment		,#제품번호
    pbane	varchar(100) not null	,#제품명
	pprice	int unsigned default 0	,	#제품가격
	constraint primary key(pno)      ,#pk필드_선정
    cno	int						,#fk필드 선언, 선정(pk필드와 동일한 타입 권장)
	constraint foreign key(cno) references category(cno) #fk필드설정
);
#[6]주문테이블
create table porder(
	pono int auto_increment				,#주문번호
    pndate	datetime default now()		,#주문날짜 , 현재 시스템 날짜 자동
    constraint primary key(pono)		 #pk필드 선정

);

#[7]주문상세 테이블
create table porderdetail(
pondno int auto_increment				,#주문상세
podamount tinyint unsigned	not null	,#주문수량
constraint primary key(podno)			,#주문상세 PK필드
pno int									,#제품번호FK 필드
constraint foreign key(pno) references product(pno),
pono int								,#주문번호FK
constraint  foreign key(pono) references porder(pono)
    #주문번호FK

);
#테이블을 짤때 1대1인지 1대 다인지, 1대 다인경우나눠서 테이블을 만들어야함 







