package day06;

import java.util.Scanner;

/*
실습1 :   (식당) 대기번호 발행 프로그램 
		- 전화번호, 인원수를 입력받아 저장/출력/삭제/수정
		- 문법 : 변수 , 연산자, 제어문(조건문, 반복문)
		- 총대기명단은 3개를 저장하고 싶다. 대기명단 1개당 전화번호 , 인원수  저장소(변수) 2개필요 , 대기명단3----> 변수 6개 필요.
		
		
		
		
*/




public class Example1_문제못풀었음_수업자료보면서정리 {
	
	//여기서 실수를 함 제대로 해석을 해야함
	
		

	public static void main(String[] args) {
		
		String name1 = null;
		String num1 = null;
		
		String name2 = null;
		String num2 = null;
		
		String name3 = null;
		String num3 = null;
		
		while (true) {
			System.out.println("======아래에입력해주세요=====");
			System.out.println("1.등록 2.확인");
			
			Scanner scan = new Scanner(System.in);
			
			int menu = scan.nextInt();
		
			// 여기가 엉망이 었음 if문을 어떻게 쓸지를 생각하고 흐름을 생각할것
			
		if (menu == 1) {System.out.println(">>등록을 선택하셨습니다.");
			System.out.println(">전화번호 :");
				String num = scan.next();
			System.out.println(">이름 :");
				String name = scan.next();
				
			if(name1 == null && num1 == null) { 
				name1 = name; num1 =num; 
			}else if (name2 == null && num2 == null) {
				name2 = name; num2 = num;
				
			}else if(name3 == null && num3 == null) { 
				name3 = name; num3 = num;
				
			}else {
				System.out.println("**등록실패 : 게시물 작성공간이 부족합니다.**");
			}
				
		
				
		}// if end
		
		else if(menu ==2) {System.out.println(">>2. 출력"); 
			if(name1 != null) {
				System.out.println(">이름 :" + name1 + ">전화번호 :" + num1);
			} 
			
		}
		
		if (name2 != null) {
			System.out.println(">이름 :" + name2 + ">전화번호" + num2);
		}
		
		
		
			
			
		}// while end
		
		
		
		
		/*      교수님 수업자료
		 * 
		 // [5] 각 사용자에게 입력받은 값들을 저장할 변수 선언 
		String phone1 = null;	int count1 = 0;
		String phone2 = null;	int count2 = 0;
		String phone3 = null;	int count3 = 0;
		while( true ) { // [1] while 반복문 , while(true){} 무한반복문 , 대기명단을 등록과출력을 24시간 하기 위해서 무한루프 사용했다.
			System.out.print("\n\n>>>>1.대기 등록 2.대기 현황 : "); // [2] 출력함수 , print() , 사용자에게 등록과 출력 메뉴를 보여준다.
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();// [3] 입력함수 , Scanner객체필요 , nextInt()함수 이용하하여 정수타입을 입력받아 정수타입 변수에 저장했다
			// [4] 조건문 , if(흐름조건) , 입력받은 값(메뉴선택)에 따른 흐름제어(1이면 , 2이면 )
			if( choose == 1 ) { System.out.println(">>> 대기명단 등록 >>>");
				// [5] 각 사용자에게 필요한 데이터 입력받기. 
				System.out.print(">> 전화번호 : ");	String phone = scan.next();
				System.out.print(">> 인원수 : ");		int count = scan.nextInt();
				// [6] 만약에 비어 있는 명단이 있으면 각 입력받 데이터를 비어 있는 곳에 대입하기 , 비어있다 , 문자열이면 null , 숫자이면 0 판단 , 임의 판단 
				if( phone1 == null ) { phone1 = phone; count1 = count; }
				else if( phone2 == null ) { phone2 = phone; count2 = count; }
				else if( phone3 == null ) { phone3 = phone; count3 = count; }	
			}else if( choose == 2 ) {System.out.println(">>> 대기명단 현황 >>>");
				// [7] 만약에 비어 있지 않으면(명단이 있으면) 각각 변수값 출력하기. 
				if( phone1 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , count1 , phone1 ); }
				if( phone2 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , count2 , phone2 ); }
				if( phone3 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , count3 , phone3 ); }
			}
		} // while end  
		  
		 */
		
		
		
		
	
		
		
			
		

	}//main end

} // calss end
