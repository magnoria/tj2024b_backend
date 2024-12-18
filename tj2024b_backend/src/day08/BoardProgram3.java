package day08;

import java.util.Iterator;
import java.util.Scanner;



/*
 - 문법 " 변수, 입출력함수 
 
 * */



// (1) main 함수를 갖는 실행 클래스로 사용
public class BoardProgram3 {// class start
	
	public static void main(String[] args) {// main start
		
		//[5] 클래스 정의하기, 게시물 타입/자료형 만들기 
		// + 동일한 클래스의 서로 다른 객체를 저장하기 위한 *배열* 선언하기
		//int[] arr1 = new int[100]; //초기화를 하지 않고 int 타입의 서로 다른 자료 100개 저장가능한 배열 선언  ,정수 0이 100개 생성
		
		//
		Board[] boardArray = new Board[100];		
		while (true) {// 반복문, while(조건){}, while(true){}무한루프, 등록과 출력 기능을 여러번 실행하기 위해 , 정수 0이 100개 생
			
			
			System.out.print("1.등록 2.출력 :"); // [2]출력함수
			Scanner scan = new Scanner(System.in);//[3]입렬객체
			int choose = scan.nextInt();//[3]입력함수
			if (choose == 1) {// [4] 조건문 , if(조건){} , 입력받은 값에 따른 흐름제어
				System.out.println(">>등록 선택했습니다.");
				//[6] 키보드로 3개의 정보를 입력받기
				System.out.print(">제목 :"); String title = scan.next();
				System.out.print(">내용 :"); String content = scan.next();
				System.out.print(">작성자 :"); String writer = scan.next();
				//[7] 3개의 정보를 하나의 객체로 만들기
				Board board = new Board();
				board.title = title;
				board.content = content;
				board.writer = writer;
				
				//[8] 객체를 배열에 저장, 빈공간을 찾아서 빈공간에 저장하기
				// * 배열내 빈공간 찾기 (여러개[배열] 중에서 원하는 값 찾기, 비교 , ==같다)
				// 8-3 : for문 실행한 결과를 저장하는 변수
				boolean saveState = false;
				for (int index = 0; index < boardArray.length-1; index++) {
					// 8-1 : index 0 부터 마지막 인덱스까지 1씩 증가하면서 반복처리
					if (boardArray[index] == null) {
					//8-2 : 배열내 index번째 요소가 null이면 , 게시물 객체가 없으면
						boardArray[index] = board; // 해당 인덱스의 새로 만든 (게시물)객체 대입하기.   비교를 무엇이랑 할지 확실히 환인하기
						saveState = true;
						//System.out.println(">등록성공했습니다.");
						break; // - 가장 가까운 반복문 종료// for안에서 원하는 목표를 이뤘기 때문에 if는 반복문이 아님
						
					}//if end
				}// for end
				
				//[9]저장여부 상태에 따른 출력
				if (saveState == true) {System.out.println(">게시물 등록성공");
					
				}else {System.out.println(">>출력 선택했습니다.");}
			}
			else if (choose==2) {
				System.out.println(">>출력 선택했습니다.");
				
				//[10] 배열내 모든 요소(게시물 객체)를 출력하기, 빈공간이 아니면 (!=null)
				for (int index = 0; index <= boardArray.length-1; index++) {
					if (boardArray[index] != null) {
						Board board = boardArray[index];
						System.out.printf("순번 : %d , 제목 : %s , 내용 : %s, 작성자 : %s \n" , index , board.title, board.content, board.writer);
						
					}
					
				}
				
			}
			
		}// while end
		
		
		
		
		
		
		
		
		
		
	}//main end
	

}//class end
