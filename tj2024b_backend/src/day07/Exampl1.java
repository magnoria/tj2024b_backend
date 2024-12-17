package day07;

import java.util.Scanner;

/*
자바 과제 : (식당) 대기번호 발행 프로그램
- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스(멤버변수)/객체
- 전화번호 , 인원수 를 입력받아서 저장·출력 구현
- 명단 클래스 설계한다.
- 총 대기명단은 3개 까지 가능하다. 
제출 : 카카오톡방에 과제 코드가 존재하는 본인 git 상세주소 제출 
*/

public class Exampl1 {
	public static void main(String[] args) {
		
		list list1 = null;
		list list2 = null;
		list list3 = null;
		
	
		while (true) {
			
			System.out.println("1.등록 2. 출력 :");
			
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if (choose == 1) {
				System.out.println(">>등록선택했습니다."); 
				System.out.println("> 전화번호 :"); String num = scan.next();
				System.out.println("> 인원수 :"); int peple = scan.nextInt();
				
				if (list1 == null) {
					list1.Num = num; list1.Peple = peple;
					
				}else if (list2 == null) {
					list2.Num = num; list2.Peple = peple;
				}else if (list3 == null) {
					list3.Num = num; list3.Peple = peple;
				}
				
			}
			else if (choose == 2) {System.out.println(">>출력을 선택했습니다");
				if (list1.Num != null) {
					System.out.println("번호 :" + list1.Num + "인원수 :" + list1.Peple);
					
				}
				if (list2.Num != null) {
					System.out.println("번호 :" + list2.Num + "인원수 :" + list2.Peple);
					
				}
				if (list3.Num != null) {
					System.out.println("번호 :" + list3.Num + "인원수 :" + list3.Peple);
				}
			
			}//els if end
			
		}//while end
		
		
	}// main end
	

}
