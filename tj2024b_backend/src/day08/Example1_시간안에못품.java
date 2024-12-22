package day08;


import java.util.Iterator;
import java.util.Scanner;

/*
 
	자바 과제7 : (식당) 대기번호 발행 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/ 반복문) , 클래스(멤버변수)/객체, 배열
	- 전화번호 , 인원수를 입력받아서 저장, 출력 구현
	- 명단클래스 설계한다
	- 총 대기명단은 100개  까지 가능하다
	
  
 * */

public class Example1_시간안에못품 {
	public static void main(String[] args) {
		
		PerList[] boardArrayLists = new PerList[100];
		
		while (true) {
			System.out.print("1.등록 2.출력");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if (choose == 1) { System.out.print(">> 등록을 선택했습니다.");
			System.out.println("전화번호"); int num = scan.nextInt();
			System.out.println("인원수"); int peple = scan.nextInt();
			
			PerList list = new PerList();
			list.number = num;
			list.person = peple;
			
			
			boolean saveState = false;
			for (int index = 0; index <= boardArrayLists.length-1; index++) {
			
				
			}
				
			}
			else if (choose == 2) {
				
			}//els end
			
		} // while end
	}//main end
	
	
	
	

}
