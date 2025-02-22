package day08;

import java.util.Scanner;

import day07.Waiting;
import day07.list;

public class Example1_1코드확인 {
	
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
				//waiting.phone = phone; waiting.count = count; 
				 
				
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
						//System.out.printf("인원수 %d명 , 연락처 : %s \n",
								//waitingArray[index].count , waitingArray[index].phone);
						
					}
				}
			
			}//els if end
			
		}//while end
		
		
	}// main end
	
	
	
		
	/*	Waiting[] waitingArray = new Waiting[100];
		while(true){
			System.out.print("1.명단등록 2.명단확인 : "); 
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			if( choose == 1 ) {  
				System.out.print("전화번호 :"); 	String phone = scan.next();
				System.out.print("인원수 : ");	int count = scan.nextInt();
				Waiting waiting = new Waiting();  
				waiting.phone = phone; waiting.count = count; 
				for( int index = 0 ; index <= waitingArray.length - 1 ; index++ ) {
					if( waitingArray[index] == null ) { waitingArray[index] = waiting; break; }
				} // for end 
			}else if( choose == 2) {
				for( int index = 0 ; index <= waitingArray.length - 1 ; index++ ) {
					if( waitingArray[index] != null ) {
						System.out.printf("인원수 %d 명 , 연락처 : %s \n" , 
								waitingArray[index].count , waitingArray[index].phone );
					} // if end 
				} // for end 
			} // elseif end 
		} // w end 
	} // main end 
} // class end 

//(변경사항1) 대기명단 객체가 3개가 아닌 100개로 변경 되므로 배열 사용하면 효율적이다. 
// Waiting wait1 = null;	Waiting wait2 = null;	Waiting wait3 = null;
		
//(변경사항2) 대기명단 객체 3개 에서 빈 객체 찾기 if 3번 , 객체 100개 이면 if 100번 사용..??
// if( wait1 == null ) { wait1 = waiting;}
// else if( wait2 == null ) { wait2 = waiting; }
// else if( wait3 == null ) {  wait3 = waiting; }

//( 변경사항3 ) 대기명단 객체 3개 에서 비어있지 않은 객체 출력 if 3번 , 객체 100 개이면 if 100 번사용??
// if( wait1 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait1.count , wait1.phone ); }
// if( wait2 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait2.count , wait2.phone ); }
// if( wait3 != null ) { System.out.printf("인원수 %d 명 , 연락처 : %s \n" , wait3.count , wait3.phone ); }*/
	

}
