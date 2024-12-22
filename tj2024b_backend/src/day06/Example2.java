package day06;


import java.util.Scanner;

/*
자바과제4 :  키오스크 프로그램
		- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문)
		- 제품은 콜라, 사이다, 환타 인 3개가 존재한다.
		- 각 제품의 재고는 초기에 10개씩 존재한다.
		- 각 제품의 가격은 콜라 1000원 사이다 1500원 환타 2000원 가정한다.
		- 제품을 선택시 재고 1 차감하고 장바구니에 담는다.
		- 메뉴 ] 1. 콜라 2. 사이다 3. 환타
			1. 선택시 : 콜라 선택시 콜라재고 1차감하고 장바구니에 담는다.
			2. 선택시 : 사이다 선택시 사이다 재고 1 차감하고 장바구니에 담는다.
			3. 선택시 : 환타 선택시 환타 재고 1차감하고 장바구니에 담는다.
			4. 선택시 : 현재 장바구니에 담긴 모든 현황을 보여주고 금액 합산을 출력한다.
				Ex] 콜라1개, 사이다 2개 환타0개 총금액 : 4000원
			*추가 유효성 검사 : 만일 재고가 부족하면 " 재고가 부족합니다"라고 출력하시오
			
		
*/


public class Example2 {

	public static void main(String[] args) {
		
	     int coca = 0;
	     int syda = 0;
	     int ta = 0;
		
		
		
		while(true) {
			System.out.println("=======원하는것을 고르세요=======");
			System.out.println("1.콜라 2.사이다 3.환타 4.결제");
			
			Scanner scan = new Scanner(System.in);
		
		int menu = scan.nextInt();
			
			if (menu == 1) {System.out.print("콜라수량입력");
				coca = scan.nextInt();
					
				
			}else if (menu==2) {System.out.print("사이다수량입력");
				syda = scan.nextInt();
			}else if(menu==3) {System.out.print("환타수량입력");
				ta = scan.nextInt();
			}else if(menu == 4) {System.out.println("결제 가격");
				
				int sum = (coca*1000)+(syda*1500)+(ta*2000);
				 System.out.println("총가격은 :" + sum + "입니다.");
				
			}else {
				System.out.println("개수가 안됩니다.");
			}
		
	
			
			
			
	
			
	
			
		}//while end


		
		
		
		
		
		
		
	
	}// main end

}
