package day09;

import java.util.Scanner;

/*
  자바 과제 9 :회원서비스 구현하기
  		- 문법 : 변수 , 입출력함수, 연산자, 제어문(조건문/반복문), 클래스(멤버변수/메소드)객체, 배열
  		- 회원은 최대 100명까지 저장할 수 있다.
  		- 회원 클래스와 회원서비스 클래스 정의하시오
  		- 회원정보는 아이디 , 비밀번호 , 닉네임을 갖습니다.
  		- 회원가입함수와 로그인 함수를 구현하시오.
  			회원가입함수 : 아이디 , 비밀번호 , 닉네임 3개의 각 정보를 입력받아 객체 생성후 배열에 저장하기
  			로그인함수 : 아이디, 비밀번호를 입력받아 기존의 저장된 정보와 일치한 정보가 있으면 '로그인 성공' 아니면 '로그인 실패' 출력한다.
  		- 프로그램 초기메뉴 : 1.회원가입 2. 로그인*/

public class Example2 {
	
	
	public static void main(String[] args) {
		
		LoginService Ls = new LoginService();
		
		LoginList[] lists = new LoginList[100];
		
		while (true) {
			System.out.println("1.회원가입 2.로그인 :");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if (choose == 1) {
				Ls.Loginadd(scan, lists);
				
			}if (choose == 2) {
				Ls.LoginPrint(scan, lists);
				
			}//if end
			
			
			
			
			
		}// while end
	}// main end

}
