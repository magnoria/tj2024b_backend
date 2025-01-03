package day18.step1_예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		
		//[1] 실행예외 : 프로그램 실행 도중에 발생하는 예외, 예측이 필요함
		try {
		String str1 = "강호동";
		System.out.println(str1.length());
		String str2 = null;
		System.out.println(str2.length()); // 예외발생! : NullPointerException
		}catch (NullPointerException e) {
			System.out.println("인스턴스가 존재하지 않습니다" + e);
		} // catch end
		
		//[2] 실행예외
			// Integer.parseInt(문자열) : 문자열 타입을 int 타입으로 변환함수
			//NumberFormatException
		
		try {
		String str3 = "100";
		String str4 = "1aa";
		int value1 = Integer.parseInt(str3); // "100" --> 100 OK
		int value2 = Integer.parseInt(str4); // "1aa" --> ??  fail a를 정수로 바꾸는건 불가 //NumberFormatException
		}catch (NumberFormatException e) {
			System.out.println("int타입으로 변환이 불가능합니다." + e);
		}
		
		//[3] 실행예외
			//java.lang.ArrayIndexOutOfBoundsException
		try {
		int[] intArray = {1,2,3};
		System.out.println(intArray[0]); //0번 인덱스 요소 호출
		System.out.println(intArray[3]); //3번 인덱스 요소 호출 //ArrayIndexOutOfBoundsException
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 인덱스 입니다" + e);
		}
		
		// [4] 실행예외
			//InputMismatchException
		try {
		Scanner scam = new Scanner(System.in);
		System.out.println("정수입력:");
		int value3 = scam.nextInt();// 만약에 int 타입이 허용할수 없는 문자 입력시 오류 //InputMismatchException
		}catch (InputMismatchException e) {
			System.out.println("입력값의 타입이 불일치" + e);
		}
		
		// [5] 다중 try ~ catch ~ catch, try{} 안에서 예외가 발생하면 지정한 예외클래스의 catch로 이동
			// Exception : 만약에 다중 catch에서 부모클래스인 Exception 사용할 경우는 마지막에 catch에서 사용
		try {
			Integer.parseInt("1aa"); // try안에서 예외가 발생하면 catch로 코드흐름이 이동된다
			
			int[] intArray = {1,2,3};
			System.out.println(intArray[3]);
			
			String str = null;
			System.out.println(str.length());
		
		//catch(Exception e){System.out.println(e);}
		} catch (NumberFormatException e1) {
			System.out.println(e1);
		}catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}catch (NullPointerException e3) {
			System.out.println(e3);
		}catch(Exception e){System.out.println(e);} //Exception이 상위클래스임
		
		finally {
			System.out.println("예외여부 상관없이 무조건 실행코드"); // 주로 안전하게 메모리 초기화, 연결 종료가 들어감
		}
		
	}// main end

}//class end
