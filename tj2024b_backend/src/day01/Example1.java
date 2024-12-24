package day01;

import day10.Student2;

public class Example1 {

	public static void main(String[] args) {
		
		
		// 1. p.45 변수 선언하여 사용하기
		int level; // 정수형 변수 level을 선언
		
		level = 10; // level 변수에 10을 대입
		
		
		//syso 컨트롤 스페이스 엔터
		
		System.out.println(level); // level 값 출력
		//실행 단축키 : ctrl + f11
		
		//45 1분복습
		
		
		//틀림
		//int age;
		//age = 29;
		
		int age = level;
		
		System.out.println(age);
		
		
		System.out.println(age);
		
		int age2 = 20;
		
		
		
		System.out.println(age2);
		
		
		//2. p.46 변수 초기화하기 , 초기화 : 선언할때 값을 대입
		int level2 = 10; //level 변수 선언과 동시에 값을 대입 (초기화)
		
		//int level =20;// 원래있던 변수에 초기화를 바로 할 수는 없음
		System.out.println(level2);
		
		
		Example1 exam = new Example1();

	}

}
