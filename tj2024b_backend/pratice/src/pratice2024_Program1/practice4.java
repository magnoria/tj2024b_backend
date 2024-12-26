package pratice2024_Program1;

import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
		String subject1 = null;
		String content1 = null;
		String writer1 = null;
		
		while(true) {
			System.out.println("1.저장 2.출력");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if (choose == 1) {System.out.println("저장을 선택하셨습니다");
				System.out.print("제목:"); String title = scan.next();
				System.out.print("내용:"); String content = scan.next();
				System.out.print("작성자"); String writer = scan.next();
				
					if (subject1 == null) { subject1 = title; content1 = content; writer1 = writer;
						
					}else {
						System.out.println("더이상 저장할수 없습니다");
					}
					
				
				
			}else if (choose == 2) {System.out.println("출력을 선택하셨습니다");
				if (subject1 != null) {System.out.println("제목:"+subject1+"내용:"+content1+"작성자"+writer1);
					
				}
			}
			
			
			
		}//while end
		
		
		
		
		
		
		
		
		
		
		
	}// main end
}// class end
