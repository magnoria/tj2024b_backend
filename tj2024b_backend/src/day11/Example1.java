package day11;

import java.util.Scanner;

/*
  자바 과제 11 : 회원제 게시판
  		- 초기메뉴는 로그인 과 회원가입을 제공한다.
  		- 로그인 성공하면 게시물등록과 게시물 출력을 제공합니다.
  			- 단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록 됩니다.
  
  
 
 */



public class Example1 {
	public static void main(String[] args) {
		
		
			//1. 게시물 기능(함수)을 제공하는 서비스 객체 생성
		EampleSevice es = new EampleSevice();
			//2. 게시물 객체 여러개를 저장하는 배열 생성
		EampleDto[] logins = new EampleDto[100];
		
		
			//scanner scan = new 는 여기에도 만들어도 된다
			// 지역변수에 만들고도 오류가 안뜨는 이유는 while문이 돌아갈시
			// Scanner scan = new도 사라지기 때문
			// 지속적으로 사용해야한다면 밖에 두어도 된다.
		
		
		
		
		while (true) {
			System.out.println("1.회원가입 2.로그인 :");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if(choose == 1) {
				es.loginadd(scan, logins); //객체를 통한 메소드 호출
				
			
				
				
			}if (choose == 2) { 
				es.LoginSucces(scan, logins);
				
			//EampleDto successuserDto = es.LoginSucces(scan, logins);   [!] void 메소드라 반환값이 없어서 저장 불가
				
				break;// 흐름을 몰랐음, Sevice 메소드에서 변화를 할려고 했음, break를 걸고 나와서 그냥 선택지를 고르면 됨
			}// if end
				
			
		//System.out.println(es.LoginSucces(scan, logins)); 값 불
			
		}//while end
		
		
		
	
	

}//main end
}//class end