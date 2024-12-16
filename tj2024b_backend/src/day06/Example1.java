package day06;

import java.util.Scanner;

/*
실습1 :   (식당) 대기번호 발행 프로그램 
		- 전화번호, 인원수를 입력받아 저장/출력/삭제/수정
		- 문법 : 변수 , 연산자, 제어문(조건문, 반복문)
		- 총대기명단은 3개를 저장하고 싶다. 대기명단 1개당 전화번호 , 인원수  저장소(변수) 2개필요 , 대기명단3----> 변수 6개 필요.
		
		
		
		
*/




public class Example1 {
	
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
		
		if () {
			
		}
		
			
			
		}// while end
	
		
		
			
		

	}//main end

} // calss end
