package day10;

import java.util.Scanner;

/*
 
  실습 5 : 게시판 프로그램 - v4
  - 문법 : 변수, 입출력함수 ,연산자 , 제어문(조건문/반복문), 클래스/ 객체(매개변수)
  
  
 */

public class BoardProgram5 {

	public static void main(String[] args) {
		
		Board[] boards = new Board[100];
		BoardService bs = new BoardService();
		
		while (true) {
			
			System.out.println("1.등록 2.출력 :");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if (choose == 1) {
				bs.boardAdd(scan, boards);
			}
			else if (choose == 2) {
				bs.boardPrint(boards);
			} //if end
				
			
			
		}// while end
		
		
	}//main end
	
}// class end
