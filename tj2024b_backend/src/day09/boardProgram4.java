package day09;

import java.util.Scanner;

/*
 실습 4 : 게시판 프로그램 - v4
 - 문법 : 변수, 입출력함수 , 연산자, 제어문(조건문/반복문), 클래스/객체(매개변수/메소드), 배열
 -
 * 
 * 
 * 
 * */
public class boardProgram4 { // class start
	
	public static void main(String[] args) { //main satart
		
		// (1) 게시물 기능(함수)을 제공하는 서비스 객체 생성
		BoardSevice bs = new BoardSevice();
		// (2) 게시물 객체 여러개를 저장하는 배열 생성
		Board[] boards = new Board[100];
		
		
		while(true) {
			System.out.println("1.등록 2.출력:");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if(choose == 1) {
				bs.boardAdd(scan, boards); // (1) 객체를 통한 메소드 호출
				
				
			}if(choose ==2) {
				bs.boardPrint(boards); //(1)객체를 통한 메소드 호출
			}
				
				
				
				
				
		}//while end
		
	}

}