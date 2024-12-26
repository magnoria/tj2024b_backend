package pratice2024_Program1;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class practice1_2024_12_25 {

	public static void main(String[] args) {
		/*
		  실습1 : 게시판 프로그램
		  		- 제목, 내용 , 작성자를 입력받아 저장/출력/삭제/수정
		  		- 문법 : 변수 , 연산자, 제어문(조건문, 반복문)
		  		- 게시물 3개를 저장하고 싶다. 게시물 1개당 제목/내용/작성자 저장소 3개필요----> 9개 필요.
		  		
		  		
		*/
		
		String subject1 = null;
		String content1 = null;
		String writer1 = null;
		
		String subject2 = null;
		String content2 = null;
		String writer2 = null;
		
		String subject3 = null;
		String content3 = null;
		String writer3 = null;
		
		
		while(true) {
			System.out.print("1.제목 2. 출력 : ");
			
			Scanner scan = new Scanner(System.in);
			int choiceMenu = scan.nextInt();
			
			if (choiceMenu == 1) {System.out.println(">> 등록 선택했습니다.");
				System.out.print("제목 :"); String title = scan.next();
				System.out.print("내용 :"); String content = scan.next();
				System.out.print(" 작성자 : "); String writer = scan.next();
				
				if (subject1 == null) { subject1 = title; content1 = content; writer1 = writer;
					
					}else if (subject2 == null) { subject2 = title; content2 = content; writer2 = writer;
					
					}else if (subject3 == null) { subject3 = title; content3 = content; writer3 = writer;
					
					}else {
					System.out.println("등록실패 저장공간이 부족합니다.");
				
				}// else end
	
				
			}// if end
			
			else if (choiceMenu == 2) {System.out.println("출력을 선택했습니다.");
				if (subject1 != null) {
					System.out.println("제목 :"+ subject1 + "내용 :" + content1 + "작성자 :" + writer1);
					
				}if (subject2 != null) {
					System.out.println("제목 : " + subject2 + "내용 : "+ content2 + "작성자 : " + writer2);
					
				}if (subject3 != null) {
					System.out.println("제목 : " + subject3 + "내용" + content3 + "작성자 : " + writer3);
					
			}// else if end
				
			}
			else if (choiceMenu == 3) {
				System.out.println("3. 수정선택");
				
			}else if (choiceMenu == 4) {
				System.out.println("4. 삭제선택");
				
			}
			
			
			
				
			
			
		}//while end 
		
		
		
	}//main end

}//class end
