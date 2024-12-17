package day07;

import java.util.Scanner;

//(1) main함수 갖는 실행 클래스
public class Exampl1_1 {
		public static void main(String[] args) {
			
			//[5] 클래스 정의하기 , 객체를 담을 변수 선언.
			// - 정수 3을 담기위해서는 변수타입 무엇을 사용하나요 ? int
			// -Waiting 객체를 담기 위해서는 변수타입을 Waiting으로 써야함
			
			Waiting wait1 = null;
			Waiting wait2 = null;
			Waiting wait3 = null;
			
			while (true) {
				System.out.print("1.명단등록 2.명단확인:"); //[2]출력
				Scanner scan = new Scanner(System.in);
				int choose = scan.nextInt();
				
				if (choose == 1) {
					System.out.print("전화번호"); String phone = scan.next();
					System.out.print("인원수 :"); int count = scan.nextInt();
					
					//[6]만약에 비어있는 대기명단이 있으면 객체 생성후 대입
					//[6]객체 생성후 입력받은 값 대입
					Waiting waiting = new Waiting(); //대기명단 객체 생성
					waiting.phone = phone; waiting.count = count;
					
					if (wait1 == null) {
						wait1 = waiting;
						
					}else if (wait2 == null) {
						wait2 = waiting;
					}else if (wait3 == null) {
						wait3 = waiting;
					}
				}else if (choose ==2) {
					if(wait1 != null) {
						System.out.printf("인원수 %d 명, 연락처 : %s \n:",wait1.count, wait1.count);}
					if(wait2 != null) {
						System.out.printf("인원수 %d 명, 연락처 : %s \n:",wait2.count, wait3.count);}
					if(wait3 != null) {
						System.out.printf("인원수 %d 명, 연락처 : %s \n:",wait3.count, wait3.count);}
				
				}
				
				
			}//while end
		}
}
