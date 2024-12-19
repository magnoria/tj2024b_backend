package day09;

import day06.person;

public class Example3 {
public static void main(String[] args) {
	
	//[1] 객체(인스턴스)생성하기
	new person(); //(1) new 연산자와 생성자Person() 이용한 인스턴스 생성
	
			//1. 디폴트 생성자 사용.
	person personLee = new person();//(2) 주로 생성된 인스턴스의 참조/주소/메모리 위치 값을 변수에 대입한다.
	personLee.name = "이정만";
	
	
	// new 로 person 객체를 2개로 만들었다
	
			//2. 매개변수 1개 생성자 사용
	person personKim = new person("유재석");
	
	
	
	System.out.println(personLee.name);
	System.out.println(personKim.name);
	
	// 3. 매개변수 3개 생성자 사용
	person personYou = new person("유재석", 180.1f , 82.9f);
	System.out.println(personYou.name); // 유재석
	System.out.println(personYou.height); // 180.1
	System.out.println(personYou.weight);// 82.9
	
	
	
}// main end
}
