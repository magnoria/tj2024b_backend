package day03;

public class Example3 {

	public static void main(String[] args) {
		// p.92 조건문
		
		//[1] if문
	/*	int age = 10;
			// - 만약에 age(나이)값이 8 이상이면 출력함수 실행한다.
		if (age >= 8) {//if s
			System.out.println("학교에 다닙니다");
			
			
		}//if e
		
		// [2] if~ else문
		// - 만약에 age(나이)값이 8 이상이면 출력함수 실행한다.
		if (age >= 8) {//ifs
			System.out.println("학교에 다닙니다.");
			
		}
		else {// 아니면 (위 조건의 반대 - 나이값이 8이상이 아니다, 7 이하라는 뜻)
			System.out.println("학교에 다니지 않습니다.");
			
			
		}//if e
		
			//* 1분 복습
		char gender = 'F';
		if (gender == 'F') {
			System.out.println("여성입니다");
			
		}
		else {
			System.out.println("남성입니다");
		}
		
	/*	
		if () {
			if{
				else {
					System.out.println();
					
				}
			}
			
		}*/
		// 들여쓰기 예시 들여쓰기할때 {}로가 나온다면 들여쓰기를 할것 대충 자동으로 되기는 하나 잘 사용
		
		
		//[3] if ~ elseif문
		int age = 70;
		
		int charge;
		if (age<8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다");
		}else if (age < 20) {
			charge = 2500;
			System.out.println("중,고등학생입니다.");
			
		}else if (age > 60) {
			charge = 0;
			System.out.println("경로우대입니다.");
			
		}else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}//if e
		System.out.println("입장료는" + charge + "원 입니다.");
		
		
		//* [1분복습]
		
		//if ~lese if (다수조건에 따른 하나의 결과) vs if if(다수조건에 따른 n개의 결과 실행문을 낼수있다.)
			
		//p.100 나혼자 코딩!
			//90 <= 성적 <=100; 불가능 하므로 2개이상의 조건은 논리연산자 ----> 성적 >=90 && 성적 <=100
		
		// 왜 나는 처음에 성적을 지정해야한다고 생각했을까?
		
		// 변수를 만들시 어차피 여러가지 점수를 넣고 변환을 할 수 있으므로 미리 정의할 필요가 없다.
		//어제 질문받았던것 처럼 똑같이 했다
		
		
	
		
	}//main e

}//class e
