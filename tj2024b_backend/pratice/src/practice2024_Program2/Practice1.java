package practice2024_Program2;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		// 클래스 만들기 , 객체 생성 -> 메모리 생성시 먼저 생성하는게 편한데 왜 5번째로 했을까? 
		//클래스 만들때 앞글자는 대문자
		Board board1 = new Board();
		Board board2 = new Board();
		Board board3 = new Board();
		
		while(true) {
			System.out.println("1.등록 2.출력");
			
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if (choose == 1) {System.out.println("저장을 선택하셨습니다");
				System.out.println("제목:"); String title = scan.next();
				System.out.println("내용:"); String content = scan.next();
				System.out.println("작성자:"); String writer = scan.next();
				
				
				
				
			}else if (choose == 2) {
				
			}
			
			
			
			
			
		}// while end
		
		
		
		
		
		
		
		
		
	}// main end

}//class end
