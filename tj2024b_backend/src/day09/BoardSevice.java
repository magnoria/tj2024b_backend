package day09;

import java.util.Iterator;
import java.util.Scanner;

public class BoardSevice { // class s
	
	//1. 멤버변수
	
	
	//2. 멤버함수인 메소드 구성가능
	//반환타입 함수명(타입 매개변수~)
	void boardAdd(Scanner scan , Board[] boards ) { //매개변수로 전달해서 연동한것 여기다가도 new 스캐너 만들어도됨 여러가지 방법이 있음
		System.out.println(">게시물 등록합니다."); String title = scan.next();
		System.out.print("제목 :");				String content = scan.next();
		System.out.print("작성자 :");				String writer = scan.next();
		Board board = new Board(); // [2] 객체 생성
		board.title = title;
		board.content = content;
		board.writer = writer;
		// [3] 객체를 배열에 저장
		boolean saveState = false;
		for ( int index = 0; index <boards.length-1;index++) {
			if (boards[index] == null) {
				boards[index] = board;
				saveState = true;
				break;
			}
			
			
		} // for end 
		
		
		if (saveState) {System.out.println("등록성공했습니다");
			
		} else {
			System.out.println("등록 실패했습니다.");
		}// if end
		
	}// void end
	
	void boardPrint(Board[] boards) {//매개변수로 연결시킴
		System.out.println("> 게시물 출력합니다.");
		for ( int index= 0; index <= boards.length-1;index++) {
			Board board = boards[index];
		if(board !=null) {	
			System.out.printf("순번 : %d , 제목 : %s ,내용 : %s , 작성자 :%s \n",
					index , board.title , board.content , board.writer);
			
		}
		}
	}// v end
	
	

}// class end
