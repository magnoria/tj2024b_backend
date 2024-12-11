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
			h+=1;
		}// if end	
		
		if (h <0) {
			h +=1;
			
		}//if end

	
		
	
	
		
		
		System.out.print(h+"시간");
		System.out.print(""+m+"분");
		
		
		
	} //if e

}
