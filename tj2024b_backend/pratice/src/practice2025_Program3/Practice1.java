package practice2025_Program3;

import java.util.Iterator;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		
		//로컬및 서버를 안쓰니 배열 저장
		Board[] boardArray = new Board[100];
		
		while (true) {
			System.out.println("1.등록 2.출력");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
				if (choose == 1) { System.out.println("출력을 선택했습니다.");
					System.out.print("제목"); String title = scan.next();
					System.out.print("내용"); String content = scan.next();
					System.out.print("작성자"); String writer = scan.next();
					
						
					//3개의 객체를 하나의 객체로 만들기*
					Board board = new Board();
					board.title = title;
					board.content = content;
					board.writer = writer;
						
					//객체를 빈배열찾아 저장
					boolean saveState = false; // 확인
					for(int i = 0; i <= boardArray.length-1; i++) {
						// index 확인후 비어있는지 확인후 넣기
						if (boardArray[i] == null) {
							boardArray[i] = board; // 3개를 하나로 만들어서 넣기 쉽게 만들었음
							saveState = true; //위가 true일경우 아래로 내려와서 true값으로 변경
							break; // 더이상 같은걸 넣지 않도록 break;
						}//if end
						
						
					}//for end
					
					//저장이 제대로 되있는지 한버더 확인하기 위해 상태확인
					if (saveState == true) {
						System.out.println("게시물 등록 성공");
					}else {
						System.out.println("등록 실패");
					}
					
					
					
				}else if (choose == 2) {
					System.out.println("출력선택했습니다.");
					
					//배열내 확인후 출력
					for(int i=0; i <= boardArray.length-1; i++) {
						if (boardArray[i] != null) {
							Board board = boardArray[i]; //boardArray의 인덱스를 board에 집어넣는다
							System.out.printf("순번: %d, 제목:%s , 내용:%s, 작성자:%s \n", i , board.title,board.content,board.writer);
							
						}//if end
						
					}//for end
					
				}
			
			
		}// w end
		
		
		
		
		
		
		
		
		
	}//main end
}//class end 
