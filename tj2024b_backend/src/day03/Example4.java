package day03;


import java.util.Scanner; //이게 Scanner scan 입력시 만들어짐 

public class Example4 {

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
//문제3 3개의 정수형으로 수를 이력받아 가장 큰 수를 출력[전제조건 : 각 정수는 서로 다른 정수값]
		System.out.print("1.정수를 입력하세요 :");
			int num1 = scan.nextInt();
		
		
		System.out.print("2.정수를 입력하세요 :");
			int num2 = scan.nextInt();
			
			
		System.out.print("3.정수를 입력하세요 :");
			int num3 = scan.nextInt();
			
			
			int firsnum;
					
		/*	if (num2 == num3 || num2 ==num1) {//기억할것 2개이상 쓸때는 && || 쓰기
				System.out.print("정수가같아 출력할 수 없습니다.");
			} else if (num1 > num2 && num1 > num2) {
				System.out.print("이 정수가 제일 큽니다."+ num1);
			}else if() day11 swap
			이방법으로 한번 풀어보기	*/
			
			
			
//문제 5 가위바위보
	System.out.println("플레이어1 :");	
	int play1 = scan.nextInt();
	
	System.out.println("플레이어2 :");
	int play2 = scan.nextInt();
	

			

	}//main e

}
