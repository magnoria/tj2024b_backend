package day16.step3;

class Parent{// 상위 클래스
	
	String filed1; //멤버변수
	public void method1() {
		System.out.println("Parent method1"); //멤버함수 메소드
		}
	public void method2() {System.out.println("Parent method2");}
	
}// class end

class Child extends Parent{//하위클래스
	String filed2;
	public void method3() {System.out.println("Parent method3");}
	//* 물려받은/상위클래스의 메소드를 재정의/코드변경 = 오버라이딩
		// 주의할점 : 메소드의 선언부는 동일하게 작성 , { }안에 있는 코드만 재정의
	@Override // 오버라이딩 어노테이션 // 생략은 가능		멤버변수가 동일하면 this/super, 메소드명이 동일하면 왜? this/super 안쓰는 이유는
													//멤버변수는 인스턴스마다 할당되고, 메소드는 모든 인스턴스가 하나의 메소드를 공유해서 사용하기 때문이다.
	
	public void method1() {
		System.out.println("child method1");
	}
	public void method2() {System.out.println("child method2");}
	
}// class end


public class Example3 {
	public static void main(String[] args) {
		//1. 자식클래스 인스턴스 생성
		Child child = new Child();
		child.method1(); //자식의 인스턴스는 부모 클래스의 메소드를 사용할수 있다. 단, 오버라이딩 메소드인 경우 현 인스턴스의 메소드가 호출된다
		child.method2(); //child method2 // 즉] 오버라이딩이 최우선 호출대상이다.
		child.method3();
		
		//2. 자식 클래스의 인스턴스가 부모 클래스로 타입변환
		Parent parent = child; //타입변환
		parent.method1();		// CHild method1 , 타입이 변환된다고 해서 인스턴스가 바뀌는건 아니기에 오버라이딩이 최우선 호출된다.
		parent.method2();
		//parent.method3();       //타입변환시 하위 타입의 멤버에 접근할 수 없다.
		
		//3. 부모클래스의 타입에서 자식 클래스의 타입 변환
		Child child2 = (Child)parent;		// 부모타입 --> 자식타입 OK // 태생이 child 이라서
		child2.method1();		//child method1
		child2.method2();		//child method2
		child2.method3();		//Parent method3
		
		//4. 부모 클래스의 인스턴스 생성
		Parent parent2 = new Parent();
		parent2.method1();		//Parent method1
		//Child child3 = (Child)parent2;// 부모타입 --> 자식타입 Fail // 태상이 child가 아니라서.
		//Exception in thread "main" java.lang.ClassCastException: class day16.step3.Parent cannot be cast to class day16.step3.Child (day16.step3.Parent and day16.step3.Child are in unnamed module of loader 'app')
		//at day16.step3.Example3.main(Example3.java:52)
		
		//*태생검사
		if (parent2 instanceof Child) {// parent2 변수가 가리키는 인스턴스가 Child 타입을 참조하고 있어? true 또는 false
			Child child3 = (Child)parent2;
		}else {
			System.out.println("타입을 변환할수가 없습니다.");
		}
		
		
	}

}
