package day03;



import java.util.Scanner; //이게 Scanner scan 입력시 만들어짐 

public class Example4_문제풀이 {

	public static void main(String[] args) {
		
		// [ 구현 문제 , FOR문 없이 풀이 ] 
//문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
		Scanner scan = new Scanner(System.in); //- 입력객체 , 입력객체 안에 입력관련 함수를 제공한다.
		
		
		
		
		//System.out.print("점수입력:");
		
		//int score = scan.nextInt();
		
		//String sc = score >= 90 ? "합격" : "불합격";
		//System.out.println(sc);
		
		
//문제2 
	/*	System.out.print("점수입력:");
	
		int score1 = scan.nextInt();
		
		String sc1;
		
		if (score1 >= 90) {
			sc1 = "A등급";
			
		}else if (score1 >= 80) {
			sc1 = "B등급";
			
		}else if (score1 >= 70) {
			sc1 = "c등급";
		}else{
			sc1 = "재시험";
		}// if e
		System.out.println(sc1);
		
		*/
//문제3 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력[전제조건 : 각 정수는 서로 다른 정수값]
		
		//입력
		System.out.print("1.정수를 입력하세요 :");
			int num1 = scan.nextInt();
		
		
		System.out.print("2.정수를 입력하세요 :");
			int num2 = scan.nextInt();
			
			
		System.out.print("3.정수를 입력하세요 :");
			int num3 = scan.nextInt();
			
			
			int firsnum; //저장
					
		/*	if (num2 == num3 || num2 ==num1) {//기억할것 2개이상 쓸때는 && || 쓰기
				System.out.print("정수가같아 출력할 수 없습니다.");
			} else if (num1 > num2 && num1 > num2) {
				System.out.print("이 정수가 제일 큽니다."+ num1);
			}else if() day11 swap
			이방법으로 한번 풀어보기	*/

			//연산
			int max = num1; // 일단 하나를 최고값으로 잡는다
			
			if (max < num2) { max = num2;} //연산이 되게 쉬워진다
			if (max < num3) { max = num3;}
			
			//출력
			System.out.println(max);
			
			
//문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오.[전제조건 : 각 정수는 서로 다른 정수값]
			//처음 본다면 아마 if문을 써야한다고 생각했을 것이다
			// 제일 낮은 값부터 제일 높은값순으로 나열해야하기에 크기 비교를 할것이다.
			//입력,저장
			System.out.println("정수입력:");
			int value1 = scan.nextInt();
			
			System.out.println("정수입력:");
			int value2 = scan.nextInt();
			
			System.out.println("정수입력:");
			int value3 = scan.nextInt();
			
			//연산
			if (value1 > value2) {
				int temp = value1; value1 = value2; value2 = temp;
			}//if end
			
			if(value1 > value3) {int temp = value1; value1 = value3; value3 = value1;
			}//if end
			
			if (value2 > value3) {
				int temp = value2; value2 = value3; value3 = temp;
			}//if end
			
			
			//출력
			System.out.println(value1);
			System.out.println(value2);
			System.out.println(value3);
			
			
			//
			
//문제 5 가위바위보 가위 0 바위 1 보 2
			//입력,저장
	System.out.println("플레이어1 :");	
	int play1 = scan.nextInt();
	
	System.out.println("플레이어2 :");
	int play2 = scan.nextInt();
	
	if (play1 == 0 && play2 == 2) {
		System.out.println("플레이어1 승");
		
	} else if (play1 == 1 && play2 == 0 ) {
		System.out.println("플레이어1 승");
		
	}else if (play1 == 2 && play2 == 1) {
		System.out.println("플레이어1 승");
		
	}else if (play2 == 0 && play1 == 2) {
		System.out.println("플레이어2 승");
		
		
	}else if (play2 == 1 && play1 == 0) {
		System.out.println("플레이어2 승");
		
	}else if (play2 == 2 && play1 ==1) {
		System.out.println("플레이어2 승");
		
	}else {
		System.out.println("무승부");
	}//if end
	
	//[6] 윤년/ 평년 판단하기
	
	
	
	
	//[7] 주차요금 계산하기
		int 시 = 9;
		int 분 = 30;
	
			

	}//main e

}
