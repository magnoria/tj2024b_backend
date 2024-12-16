package day06;  // 현재 클래스가 위치한 패키지/폴더 명

import java.util.Scanner;

/*
  실습1 : 게시판 프로그램
  		- 제목, 내용 , 작성자를 입력받아 저장/출력/삭제/수정
  		- 문법 : 변수 , 연산자, 제어문(조건문, 반복문)
  		- 게시물 3개를 저장하고 싶다. 게시물 1개당 제목/내용/작성자 저장소 3개필요----> 9개 필요.
  		
  		
*/


public class BoardProgram1 {// class start // 자바의 모든 코드는 class안에 존재한다.

	public static void main(String[] args) { // main start //자바의 모든 실행코드는 main안에서 시작된다.
		
		//[6]변수 , 타입[boolean byte short int long float double char], 참조타입 [String , Scanner 등등] 참조타입은 앞을 대문자로 씀
		String 제목1 =null; // null이란? 참조값이 없다는 뜻, 문자열이 없다는 뜻
		String 내용1 =null;
		String 작성자1=null;		
		
		String 제목2 = null;
		String 내용2 = null;
		String 작성자2 = null;
		
		
		String 제목3 = null;
		String 내용3 = null;
		String 작성자3 = null;
		
		
		while(true) {//[1] 반복문 , 무한루프  // while start
			
			// [2]출력함수, syso + space bar
				System.out.println("====== 게시판 프로그램=======");
				System.out.println("1.등록 2.출력 3.수정 4.삭제");
			// [3]입력함수 , 
			//1. 입력객체 :Scanner scan =	new Scanner(System.in);
				Scanner scan =	new Scanner(System.in);
			//2.입력 객체 이용한 입력함수 : 변수명.nextXXX()
			int 선택메뉴 = scan.nextInt();// - 우리가 정의한 메뉴번호 선택받기 // -입력받은 값 저장 // int로 받았기 때문에 문자를 쓰면 오류가 뜸
				
			// [4] 연산자 , == 같다
			// [5] 조건문 , if(조건문){}
				if(선택메뉴 == 1) {System.out.println(">>등록 선택했습니다.");
					System.out.print(">제목 :");  String title = scan.next();   //메시지(rpint) -> 입력(next) ->저장 (변수)
					System.out.print(">내용 :");	String content = scan.next();
					System.out.print("> 작성자 :");	String writer = scan.next();
					
					if (제목1 == null) {제목1 = title; 내용1 = content; 작성자1 = writer;//[7] 변수값에 따른 데이터 검사후 대입 // 첫버째 게시물이 비어 있으면
																						//	- while 밖 변수에 입력받은 3개의 문자열을 각각 저장
					}else if (제목2 == null) {제목2 = title; 내용2 = content; 작성자2 = writer; //두번째 게시물이 비어있으면
						
					}else if (제목3 == null) {제목3 = title; 내용3 = content; 작성자3 = writer; // 세번째 게시물이 비어있으면
						
					}else {
						System.out.println("**등록실패 : 게시물 작성공간이 부족합니다.**"); //그외
					}
					
					// [6-2] 변수값 수정
					// - while 밖에 변수에 입력받은 3개의 문자열을 각각 저장
					//제목1 = title; 내용1 = content; 작성자1 = writer; 더 저장할려고 수정
					//System.out.println("**등록성공**"); // 코드 설명 주석을 달아서 혼자서 공부할때 생각해서 사용하기
					
				
					
				} //if end
				
				else if (선택메뉴 == 2) {System.out.println(">>2. 출력 선택했습니다.");
				//[7-2] 변수값에 따른 데이터 검사후 출력//[6-3] 변수값 호출
				if (제목1 != null) {System.out.println(">제목 :" + 제목1 +">내용 :" + 내용1 + ">작성자" + 작성자1);
					
				}
				if (제목2 != null) {System.out.println(">제목 :" + 제목2 +">내용 :" + 내용2 + ">작성자" + 작성자2);
					
				}
				
				if (제목3 != null) {System.out.println(">제목 :" + 제목3 +">내용 :" + 내용3 + ">작성자" + 작성자3);
					
				}
			
				//System.out.println(">제목 :" + 제목1 +">내용 :" + 내용1 + ">작성자" + 작성자1); // 오류가 발생하는 이유 : 변수의 초기값이 없다.
				//System.out.println(">내용 :"+ 내용1);		// - 초기값이 없다(쓰레기값 - 변수를 유지하기 위한 컴퓨터가 만든 임의값) , 0 ,null , "" ,''모두 다르다.
				//System.out.println(">작성자1;"+ 작성자1);	// - 지역변수가 초기값이 없으면 호출이 불가능하다.
														//처음에는 출력을 하나만 했으나 나중에 수정
				
					
				}//else if end
				else if (선택메뉴 == 3) {System.out.println(">>3. 수정 선택했습니다.");
					
				}else if (선택메뉴 == 4) {System.out.println(">>4. 삭제 선택했습니다.");
					
				}
					
				
		}//while end
		
		

	} //main end

}// class end
