package day24;

import java.util.Scanner;

public class StringEample {
	public static void main(String[] args) {
		
		//[1] 변수 몇개? 2개 , 자료 몇개? 1개
				//리터럴이란? 키보드로부터 입력받은 자료, 상수풀(이미저장된값)
		
		int a = 3;
		int b = 3;
		System.out.println(a == b); // true
		//즉] 서로다른 두변수는 같은 자료를 참조한다.
		
		//[2] 변수 몇개? 2개 , 자료 몇개? 1개
		int c = 5;
		int d = c;
		System.out.println("c == d"); //true
		//즉] c가 참조하는 5를 d에 대입했다. 그러므로 c와d는 같은 자료를 참조한다.
		
		//[3] 변수 몇개? 2개 , 자료 몇개> 2개(3 , newInteget(인스턴스))
		Integer value1 = 3; // 순수한 자료의 리터럴
		Integer value2 = new Integer(3); //취소선 : 권장하지 않음이란 뜻 // 순수한 자료의 리터럴이 저장된 instence
		System.out.println( value1 == value2); //false //리터럴 비교 //스택값비교
		System.out.println( value1.equals(value2)); //true //인스턴스안에 값 비교 //힙 값 비교
		
		//[4] String 클래스
		//1. 배열을 이용한 문자열표현
		char[] str1 = new char[]{'유' , '재' , '석'} ;
		//2. "" 리터럴을 이용한 문자열
		String str2 = "유재석";				// 상수풀(리터럴)의 "유재석"
		//3. 생성자 이용한 문자열
		String str3 = new String("유재석");	// 인스턴스의 "유재석"
		
		
		System.out.println(str2 == str3); //flase
		System.out.println(str2.equals(str3)); //true
		String str4 = "유재석";
		System.out.println(str2 == str4);		//true 리터럴끼리는 비교 가능
		
		
		// [5] String 주요 메소드
				//1.
			String str5 = "자바".concat("프로그래밍");
			System.out.println(str5); //자바프로그래밍
				//2.
			StringBuilder builder = new StringBuilder();
			builder.append("자바");
			builder.append("프로그래밍");
			System.out.println(builder); //자바프로그래밍
				//3.
			String str6 = String.format("%s %s" ,"자바" , "프로그래밍");
			System.out.println(str6); // 자바 프로그래밍
				//4.
			String str7 = "";
			str7 += "자바";
			str7 += "프로그래밍";
			System.out.println(str7);
			// 연산/함수는 무조건 하나의 결과만 도출한다.
			char gender = "012345-1230123".charAt(7);
			System.out.println(gender); //
				//[활용] .nextChar()없는 이유는 .next().charAt(0): 한글자 입력
			//Scanner scan = new Scanner(System.in);
			//char ch = scan.next().charAt(0); // 입력받은 문자열의 첫글자 추출
			
				//6. .length()
			System.out.println("012345-1230123".length()); // 14
				//[활용] 반복문 : 변수명.length()-1[마지막 인덱스]
				// for(int index =0; index <= 변수명.length()-1; index++){}
				
			
				//7. .replace(기존문자열, 새로운문자열);
				String str8 = "자바프로그래밍".replace("자바", "JAVA");
				System.out.println(str8); //JAVA
					//[활용] html <br/> --> java(\n)
					String htmlData = "유재석<br/>안녕하세요";
					System.out.println(htmlData);
					String javaData = htmlData.replace("<br/>","\n");
					System.out.println(javaData);
							// repalce 매우 중요
			
			
		
		
		
		
		
		
		
	}// main end
	
}// class
