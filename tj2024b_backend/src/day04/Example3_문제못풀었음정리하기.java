package day04;


public class Example3_문제못풀었음정리하기 {

	public static void main(String[] args) {
		
		// [1] for , 1부터 10까지 더하는 과정
			
		int sum = 0;
		sum += 1; sum += 2; sum +=3; sum += 4; sum += 5;
		sum += 6; sum += 7; sum +=8; sum += 9; sum += 10;
			// - 반복되는 코드  :sum +=
		
		
		
		//2.
		int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			sum2 += i;
		}//for end
		
		System.out.println("1부터 10까지 합 :" + sum2);
			// 문법공부/ 문제 : ~~ 문법 반복문 사용하세요x
			// 실무 /프로젝트 :상황에따른 코드가 특정한 규칙/ 패턴에 따라 반복되는게 보일경우 사용
			// 구구단이나 여러가지 문제를 풀면서 상황파악을 연습하기
		
		
		
		for(int i=1; i<= 10; i++) {
			System.out.println("안녕하세요" + i);
		}
		
		//구구단
		
		int dan; // 
		
		for(dan = 2; dan <= 9; dan++) { //선언을 여기서 하고 싶으면 int dan = 2 를 써도 되지만 다만 휘발되기때문에 전역변수에서 계속쓰고 싶다면 밖에다가 만들어야한다.
		
			for(int gob = 1; gob <=9 ; gob++) {
				System.out.println(dan+"x"+ gob + "=" + (dan*gob));
				
		}
		
			System.out.println(); //공백만들려고 만듬
			
		}
		
		//[1분복습 p.118]
		
		for(int dan1 = 3 ; dan1 <= 7; dan1++ ) {
			
			for(int gob1 = 1 ; gob1 <= 9 ; gob1 ++) {
				System.out.println(dan1+"x"+ gob1 + "=" + (dan1*gob1));
		}
			
		}
			
		// [5] continu문 , 이후의 문장은 수행하지 않고 for문의 증감식으로 이동한다.
		//1~100까지의 홀수값들의 누적합계
		int total = 0;
		for(int num = 1; num<= 100; num++) {
			
			
		}
		
		//[7] break, 가장가까운 for/ switch 문{}을 탈출/종료한다.
		int sum3 = 0;
		for(int num =0;;num++) {
			sum3 += sum;
			if( sum3 >=100) {break;}
			//만약에 sum3이 100보다 이상이면 반복문 종료/탈출한다.
		}
			
			
			
		//1. 
		
			
		
		
		//2.
		
		for(int gugu = 2; dan <= 9; gugu++) {
			
			
			for(int last = 2; last <= 9; last++) {
				if (dan%2 != 0) {continue;}
				System.out.println(gugu + "="+ gugu*last );
			}
			
		}
		
		
		
		
		
		//3.
		
		
		//4.
		
		
		
		//5.
		
		
		
		
		
		

	}//main end

}
