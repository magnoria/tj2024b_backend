package day07;


import java.util.Arrays;
import java.util.Iterator;

public class 중간과제 {

	public static void main(String[] args) {
		
		
		double [] tast= new double[]{2,3,5,6,8}; // 배열 선언 및 초기화
		double sum= 0;
		
		for (int i = 0; i <= tast.length-1; i++) {
			
			
			
			sum += tast[i];
			
			
		}// for end
		
		System.out.println("총점 :"+ sum);
		       double 평균 = sum/tast.length;
		       
		       // 여기서 평균 구할때 5를 나누는 것 보다 code로 할 수 있는 방법이 뭐가 있을까
		       //tast.length 로 하면 배열의 수만큼이니 5를 쓰는 대신 배열 수로 나눌 수 있다.
		System.out.println("평균 :"+ 평균);
		
		
		
		int[] tast1 = {52, 63, 22, 11};// 배열 만드는 방식, 배열 선언및 초기화
		System.out.println(Arrays.toString(tast1));
		
		
		
	}// main end

}
