package day09;

import java.util.Scanner;

/*

자바 과제7 : (식당) 대기번호 발행 프로그램
- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/ 반복문) , 클래스(멤버변수)/객체, 배열
- 전화번호 , 인원수를 입력받아서 저장, 출력 구현
- 명단클래스 설계한다
- 총 대기명단은 100개  까지 가능하다


* */

public class Exanple1 {
	
	public static void main(String[] args) {
		
		ExampleService Es = new ExampleService();
		
		Examlist[] lists = new Examlist[100];
		
		
		while (true) {
			System.out.println("1.등록 2.출력 :");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if (choose == 1) {
				Es.ExamPladd(scan, lists);
				
				
			}if (choose == 2) {
				Es.ExamplePrint(lists);
				
			}
			
			
		}//while end
		
		
		
		
		
	}// main end

}
