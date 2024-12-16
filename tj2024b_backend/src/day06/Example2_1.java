package day06;

import java.util.Scanner;

public class Example2_1 {
	
	//[5] 사용자로부터 입력받은 데이터들을 저장하는 변수 및 내부적인 변수
			int 콜라재고 = 10;  int 사이다재고 = 10; int 환타재고 = 10;
			int 콜라바구니 = 0;  int 사이다바구니 = 0; int 환타바구니 = 0;
			int 콜라가격 = 1000; int 사이다가격 = 1500; int 환타가격 = 2000;

			while(true) { //[1] 반복문 , while, while(true){} 무한루프
				
				System.out.println(">>1.콜라 2.사이다 3.환타 4.결제 :"); //[2]출력함수
				Scanner scan = new Scanner(System.in);
				int choose = scan.nextInt();					//[3]입력함수
				
				//[4] 조건문 , if , 입력에 따른 논리 연산
				if(choose ==1) {System.out.println(">>콜라 선택 했습니다.");
					//[8] 만약에 재고가 부족하면 안내하기
					if(콜라재고 == 0) {System.out.println("콜라 재고가 부족합니다.");
						
					}else {
							//[6] 콜라재고 변수를 1 차감한다.
							콜라재고--;
							콜라바구니++;
							
					}
							
				}
					 
					
				else if(choose ==2) {System.out.println(">>사이다 선택 했습니다.");
					if(사이다재고 == 0) {System.out.println("사이다 재고가 부족합니다.");
				
				}else {
					사이다재고--;
					사이다바구니++;
				
					}
				}
				
				
				else if(choose ==3) {System.out.println(">>환타선택했습니다.");
					if(환타재고 == 0) {System.out.println("환타 재고가 부족합니다.");
				
				}else {
					환타재고--;
					환타바구니++;
					}
				}
				
				else if(choose ==4) {System.out.println(">>결제 선택했습니다.");
				    int 총금액 = 콜라바구니*콜라가격 + 사이다바구니*사이다가격 + 환타바구니*환타가격 ; //[7] 총금액 계산하기
				    System.out.printf("바구니현황 : 콜라 %d개, 사이다 %d개, 환타 %d개, 총금액 : %d 원 \n" , 콜라바구니 , 사이다바구니 , 환타바구니 ,총금액);
				}     
				
				
			
			}//w end
			
}

}
