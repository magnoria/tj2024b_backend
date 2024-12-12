package day03;

import java.util.Scanner;

public class practice_clock {

	public static void main(String[] args) {
		//백준 2884 알람시계
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시간 :");
		int h = scan.nextInt();
		
		System.out.print("분 :");
		int m = scan.nextInt();
		
		if (m < 59) {
			
			m-=45;
	
		}//if end
		
		if (m < 0) {
			m+=60;
		}//if end
		
		if (m >= 60) {
			h++;
		}// if end	
		
		/*
import java.util.Scanner;

public class 알람시계 {

   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt(); 
      int m = sc.nextInt()-45;
      
      if( m < 0 ) {
         m += 60;
         if( h == 0 ) {             <- 이게 if문 안이라서 0이 음수일 경우에만 실행
            h = 23;
         }else { h--;}
      }
      System.out.println(h+" "+m);
   }

}
		 */
		 

	
		
	
	
		
		
		System.out.print(h+"시간");
		System.out.print(""+m+"분");
		
		/*
		 
		 //      1시간 이상도 가능한 코드
//      Scanner sc = new Scanner(System.in);
//      final int ALERTM = -45;
//      
//      int h = sc.nextInt(); 
//      int m = sc.nextInt() + ALERTM;
//      
//      if( m < 0 && h == 0 ) { h = 24; }
//      
//      int total = h * 60 + m;
//      
//      if( m < 0 && total < 0 ) { total = -total; }
//      
//      int tH = total / 60;
//      int tM = total % 60;
//      System.out.println(tH + " " + tM);
 * 
 * 
   
      Scanner sc = new Scanner(System.in);
      final int ALERTM = -45;
      int h = sc.nextInt(); 
      int m = sc.nextInt() + ALERTM;
      ( ALERTM >= 60 || -ALERTM >= 60 ) {
         
      }
      
      if( m < 0 ) {
         m += 60;
         if( h == 0 ) {
            h = 23;
         }else { h--;}
      }
      System.out.println(h+" "+m);
      */
		
		
		
	} //if e

}
