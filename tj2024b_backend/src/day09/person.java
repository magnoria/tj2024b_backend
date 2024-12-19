package day09;



public class person {
		String name;
		float height;
		float weight;
		
		// + 생성자 : 생성자가 하는 일은 객체를 처음 만들때 멤버변수나 상수를 초기화 하는 것
			// 종류 : 디폴트 생성자 : 
					//	1.생성자가 없는 클래스는 컴파일에서 자동으로 생성자를 만들어준다.
					//	2.임의의 매개변수를 사용하는 생성자
			// 목적 : 주로 멤버변수에 대한 값들을 매개변수로 받아서 인스턴스가 생성될때 멤버변수 값들을 *초기화* 역할
			// 선언 규칙 : 생성자명은 클래스명과 동일하게 한다. 함수와 동일하게 매개변수는 존재할수있지만 반환값은 없다.
			// 오버로드 : 동일한 생성자명을 여러개 선언, *전제조건* 매개변수의 개수,타입,순서가 다를 경우에만 가능 (매개변수명 제외)
		
		// 생성자 만들기
		person(){} // 디폴트생성자 : 초기화를 하지 않는 생성자
	person(String pname){
		name = pname;
	}
	
	person(String name, float height , float weight){
		//매개변수 이름과 멤버변수의 이름이 같으면 식별이 불가능.
		//+this키워드 : 현재 객체가 멤버변수를 가리킬때 사용하는 키워드
		//this.멤버변수
		
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	person(float height , float weight, String name){// 오버로드임 매개 변수의 개수, 타입 , 순서가 다를경우 지원
		
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
		

}



    