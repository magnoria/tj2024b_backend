package day17.step1;

public interface InterfaceTest {
	
	//인터페이스 멤버
	//1. 상수
		//int value1; 오류 : 인터페이스는 변수를 갖지 못한다.
	
	//(1)상수만들기 :
	int value2 = 10; // 변수가 아닌 상수로 자동 초기화를 함.	
	//(2)상수만들기2 : public static final 키워드를 이용한 상수 만들기
	public static final int value3 = 20;
	// 공통적으로 사용되기 때문에 변수가 필요없으므로 변수를 만들수가 없다
	
	
	//2. 추상메소드
	//int method1(int a) {} // 오류 : 일반 메소드는 인터페이스가 갖지 못한다.
	//(1) 추상메소드 만들기1
	int method2(int a);
	//(2) 추상메소드 만들기2
	abstract int method3(int a); // abstract 추상적인
	
}//class end
