package day12.boardprogram7;

import java.util.Scanner;

/*
자바 과제 11 : 회원제 게시판
		- 초기메뉴는 로그인 과 회원가입을 제공한다.
		- 로그인 성공하면 게시물등록과 게시물 출력을 제공합니다.
			- 단 게시물 등록시 작성자를 현재 로그인된 회원아이디로 자동 등록 됩니다.

	1. 프론트 시각화 , 시각화 요소 구성, html/css -> 다만 지금 안함으로 console 표현하고 싶은 내용물을 생각하기
	
	2. 메모리(저장) 구성 엑셀로 구성하고 지금은 class 로 구성
	
	3. 함수/기능 설계, 메소드 vs 함수 구성
		
	

*/

public class BoardProgram7 {
	
	public static void main(String[] args) {
		
		//공통으로 사용되는 저장소 변수
		MemberDto[] members = new MemberDto[100]; //배열로 만든이유는 저장해야할 것들이 많아서 여러개를 만드록
		MemberService ms = new MemberService();// 메소드를 호출하기 위해서는 이 인스턴스가 필요하다   이건 함수가 반환값이 없고 연속적으로 사용가능해서 
		String loginId = null; //이부분 중요 로그인 안했을때 null저장, 로그인 했으면 아이디 저장 목적으로 운영할 변수. 
		
		BoardDto[] boards = new BoardDto[100]; // 생성은 new가 필요하다 잊어먹지 말것
		BoardService bs = new BoardService();
		
		while(true) {
		System.out.print("1.회원가입 2.로그인");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		if(choose == 1) {
			//회원가입 함수 호출
			ms.signUp(scan, members);
		}
		else if(choose ==2) {
			//로그인 함수 호출
			loginId = ms.login(scan, members);
			if (loginId != null) {// 로그인 했다.
					System.out.println("1. 등록 2. 출력 3. 로그아웃");
					int choose2 = scan.nextInt();
					if (choose2 == 1) {
						bs.boardAdd(scan, boards, loginId); //각 게체가 메소드를 호출
										//여기서는 타입을 안쓴이유는 위에 선언을 해서 인수값을 따로 안써도 된다. 함수 사용부는 따로 타입을 안써도 된다
					}else if (choose2 == 2) {
						bs.boardPrint(boards); // 각 게체가 메소드를 호출
						
					}else if (choose2 == 3) {
						loginId = null; //로그인 상태를 null 수정함으로써 없애기 , 로그아웃은 로그인 증거를 없애는것
						break; // 안쪽 break문을 끝내는것 //가장 가까운 반복문을 없애는것
					}// if end
				
			}
		}	
		
		}//while end
		
	}//main end

}// class end
