package day02;

import java.lang.classfile.attribute.LocalVariableTableAttribute;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class Example5 {

	public static void main(String[] args) {
		
		//JS day10 연산자 문제 10개를 자바로 풀이하기
		
		//입력 : prompt()대신에 Scanner scan = new Scanner(System.in);
		
		
		//[지문1] 국어 영어 수학 점수를 각 입력받아서 각 변수에 저장하고 총점과 평균을 계산 콘솔출력
		
		Scanner scan= new Scanner(System.in);
		
		/*System.out.println("국어점수 입력:");
		int kor = scan.nextInt();
		
		System.out.println("영어점수 입력:");
		int engli =scan.nextInt();
		
		System.out.println("수학점수 입력:");
		int mad =scan.nextInt();
		
		int 총점 = (kor+engli+mad);
		
		
		System.out.println("총점:"+총점);
		
		int 평균 =총점/3;
		
		System.out.println("평균 :"+평균);
			*/
		
		//[지문2] 반지름을 입력받아서 원넓이[반지름*반지름*3.14]계산하여 console탭에 출력

		/*System.out.println("반지름 :");
		int 반지름1 =scan.nextInt(); //위 scan 주석처리 조심할것
		
		System.out.println("반지름 :");
		int 반지름2 =scan.nextInt();
		
		double pi =3.14;
		
		double sucle = 반지름1*반지름2*pi;
		System.out.println("원넓이 :" + sucle);
		
		//[지문3] 두 실수를 입력받아서 앞 실수의 값이 뒤 실수의 값의 비율% 계산하여 console
		System.out.println("실수1 :");
		double dou1 =scan.nextInt();
		
		System.out.println("실수2 :");
		double dou2 =scan.nextDouble();
		
		double persent =dou1/dou2*100;
		System.out.println("값의 비율 :"+persent);
*/		
		//[4] 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false로 cosole탭에 출력
		/*System.out.println("정수입력 :");
		int num =scan.nextInt();
	
		boolean tf = num%2 == 0 ; // 관계연산자 확인 true false는 꼭 이거 또는 다른 걸 할필요는 없으나
		System.out.println("확인 :" + tf);
		*/
		//[5] 정수를 입력받아 입력받은 값이 7의 배수이면 true /아니면 false 로 cosole 탭에 출력
	/*	System.out.println("정수입력 :");
		int num1 =scan.nextInt();
		
		boolean choice =num1%7 ==0;
		System.out.println("확인 :"+choice);
		*/
		//[6]정수를 입력받아 입력받은 값이 홀수이면서 7 배수이면 true 아니면 false로 출력
		/*System.out.print("정수입력 :");
		int num =scan.nextInt();
		
		boolean chus = num%7 ==0 && num%2 ==1;
		System.out.println("확인 :" + chus);
		*/
		//[7]십만원 단위의 금액을 입력받아 입력받은 금액의 지폐수를 
		
		/*System.out.print("십만원단위금액입력:");
		
		int mony =scan.nextInt();
		
		int t1 = mony/100000;
		int t2 = mony/10000 - t1*10;
		int t3= mony/1000 -t1*100 -t2*10;
		
		
	
		
		System.out.print("십만원"+t1+"장");
		System.out.print("만원"+""+t2+""+"장");
		System.out.println("천원"+t3+"장");
		
		*/
		
		//[8] 1차점수와 2차점수 각각입력받아서
		 //-> 총점이 150점이상이면 '합격' 아니면 '불합격' 으로 출력
		/*System.out.print("1차점수");
		int num1 =scan.nextInt();
		
		System.out.print("2차점수");
		int num2 =scan.nextInt();
		
		int 총점 = num1 + num2;
		
		boolean choice = 총점 > 150 ? true : false  ;
		
		System.out.println(choice);
		
		*/
		
		
		
	}

}
