package day04;


import java.util.Iterator;

public class Example2 {

	public static void main(String[] args) {
		
		//[1] while 문
		/*
		 while(조건식){
		 	실행문
		 }
		 - 조건식이 true이면 {}안에 있는 실행문 실행한다.
		 
		 */
		
		//[1]while문 활용하여 1부터 10까지 더하기
		int num = 1;
		int sum = 0;// = 0 없으면
			// int sum; 변수가 참조 또는 가지고 있는 값이 없다.
			// 쓰레기값(임의값/초기값없는상태)<- 타입자체가 없음 vs 0(정수타입) vs null(참조타입)
			// * 변수에 0을 대입하지 않으면 초기값이 없으므로 임의값(쓰레기값)은 연산할수 없다.
		
		while(num <= 10) { // 만약에 num이 10이하이면 반복처리 2. 조건문
			sum = sum + num; // sum += num
			num++;			// num = num +1   // num 1증가 3. 증감식
		}// w end
		
		System.out.println("1부터 10까지의 합은" + sum);
		
		//- for문 표현
		int sum2 = 0;
		
		for( int num2 = 1; num2 <= 10; num2++) {
			sum2 += num2;
		}

		//[2] whil문이 무한히 반복되는 경우, 조건식에 상수 true
	//	while(true) {
	//		System.out.println("무한 루프!!");
	//	}
		// - for문표현
	//	for(;;) {
	//		System.out.println("무한루프");
	//	}
		
		//[3] do ~ while문 
		int num3 = 1;
		int sum3 = 0;
		
		do {// 먼저실행후, 선 처리
			sum3 += num3;
			num3++;
			
		}while(num3 <= 10);
		
		System.out.println("[do while] 1부터 10까지의 합 :" + sum3);
		
		
		//[4] 구구단중에서 2단 만 출력하시오. while 과 do~ while 문으로 구현하기
	/*	int num4 = 1;
		int sum4 = 0;
		
		
		while(num4 <= 9) {
			sum4 = '2' + num4;
			num4++;
			}
		System.out.println("2단 :"+ sum4 );
		*/
		
		int gob = 1;
		while(gob<=9){
			System.out.println("2x" + gob + " = " );
		}
		
			
	}// main end

}
