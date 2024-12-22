package day04;

import java.io.StreamCorruptedException;

public class Example1_switch {

	public static void main(String[] args) {
			
		//p.102 swictch
		/*
		 switch(조건){
		 	case 값1 :
		 		실행문;
		 		break;
		 }
		 
		 - break : switch 종료, 만일 break없다면 아래 case의 실행문이 실행된다.
		 */
			int ranking = 1;
			char medalcolor;
			
			switch (ranking) { // switch(조건){case 값1 : 실행문;} break를 뺏을 시는 그냥 통과해서  A가 나옴
				case 1 :
					medalcolor = 'G';
					break; //switch종료
				case 2 :
					medalcolor = 'S';
					break; //switch종료

				case 3 :
					medalcolor = 'B';
					break; //switch종료

				default :
					medalcolor = 'A';
					break; //switch종료

			
			}//s end
			System.out.println("메달의 색깔은 :" + medalcolor);
			
			
			//[2]
			
			int month = 10;
			int day;
			switch (month) {
				
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10 :
				case 12 : //month 가 1 3 5 7 8 10 12 경우에 아래 코드가 실행된다.
					day = 31;
					break; //아래코드가 실행되지 않고 swich 종료
				case 4 :	
				case 6 :	
				case 9 :	
				case 11 :
					day = 30;
					break;
				case 2 :
					day = 30;
					break;
					
				
			
			} //sw end
			
			//[3] '메달' 문자열에 따른 메시지 출력코드 , case문에 문자열 사용하기
			String medal = "Gold"; // 선택할 변수 
			
			switch (medal) { // 선택할 변수 넣기
			
			case "Gold":
				System.out.println("금메달입니다.");
				
				break;
			case "silver" :
				System.out.println("은메달입니다");
				break;

			case "Bronze" :
				System.out.println("동메달입니다.");
				break;
				
			default: //그외
				System.out.println("메달이 없습니다.");
				
				break; //생략가능
			}//swich end
			
		//[4] if는 조건결과의 논리(t/f) 제어 , switch는 조건결과의 값(value case)제어
			
			int score = 80;
				// swich(score >= 80){} : 조건문에 논리연산, 비교연산에 따른 논리결과 케이스가 아니다. if는 논리를 제어, swhich 값을 제어
			//switch(score) {
		//	case score >= 80 : System.out.println("합격"); //조건에도 논리연산 불가
			//}
			 
		
			//[나혼자 코딩] , 지문/한국어 생각 하고 조건(논리사고력) 만드는 연습 ,
			
			int flore = 5; // 지정할 값을 만듬 몇가지 중에서 찾고싶은것의 값을 출력하기위해 씀
			
			switch (flore) { // 지정한변수 입력
			case 1:
				System.out.println("1층 약국입니다");
				break;
				
			case 2:
				System.out.println("2층 정형외과입니다");
				break;
				
			case 3:
				System.out.println("3층 피부과입니다");
				break;
				
			case 4:
				System.out.println("4층 치과입니다");
				break;
				
			case 5:
				System.out.println("5층 헬스클럽입니다");
				break;
			}
		
		
	}//mian end

}
