package day08;

import java.util.Scanner;

import day07.Waiting;
import day07.list;

public class Example1_1 {
	
	public static void main(String[] args) {
		// (변경사항1) 대기명단 객체가 3개가 아닌 100개로 변경 되므로 배열 사용하면 효율적이다.
		
		//list list1 = null;
		//list list2 = null;
		//list list3 = null;
		Waiting[] waitingArray = new Waiting[100];
		
	
		while (true) {
			
			System.out.println("1.등록 2. 출력 :");
			
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			if (choose == 1) {
				System.out.println(">>등록선택했습니다."); 
				System.out.println("> 전화번호 :"); String phone = scan.next();
				System.out.println("> 인원수 :"); int count = scan.nextInt();
				
				
				Waiting waiting = new Waiting();
				Waiting.phone = phone; Waiting.count = count;
				
				//
				//if (list1 == null) {
				//	list1.Num = num; list1.Peple = peple;
					
				//}else if (list2 == null) {
				//	list2.Num = num; list2.Peple = peple;
				//}else if (list3 == null) {
				//	list3.Num = num; list3.Peple = peple;
				//}
				
			}
			else if (choose == 2) {System.out.println(">>출력을 선택했습니다");
			//	if (list1.Num != null) {
				//	System.out.println("번호 :" + list1.Num + "인원수 :" + list1.Peple);
					
			//	}
			//	if (list2.Num != null) {
			//		System.out.println("번호 :" + list2.Num + "인원수 :" + list2.Peple);
					
			//	}
			//	if (list3.Num != null) {
			//		System.out.println("번호 :" + list3.Num + "인원수 :" + list3.Peple);
			//	}
				for(int index = 0; index <= waitingArray.length-1;index++) {
					if (waitingArray[index] !=null) {
						System.out.printf("인원수 %d명 , 연락처 : %s \n",
								waitingArray[index].count , waitingArray[index].phone);
						
					}
				}
			
			}//els if end
			
		}//while end
		
		
	}// main end
	

}
