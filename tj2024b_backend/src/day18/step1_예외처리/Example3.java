package day18.step1_예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Example3 {
	
	//[1] 메소드 내부의 예외를 호출했던곳으로 예외 떠넘기기
	public static Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException
	{
		
		//예외 처리 방법 2가지 : 1. try~catch 2. throw
		FileInputStream fis = new FileInputStream(fileName); //일반 예외 발생
		Class c = Class.forName(className); // 일반예외 발생
		return c;// 예외값을 넘겨버림
		
	}
	//[2] 메소드 내부 예외 던지기
	public static void method() throws NullPointerException {//static을 빼면 실체가 없어져서 오류가 뜸
		String str = null;
		System.out.println(str.length()); // 실행예외
		//예측 안되면 => 코드실행 => 예외확인 => 예외처리
	}//ststic : 전역변수(고정)정적 : 프로그램이 실행될때 static 키워드가 존재하는 
	//변수와 메소드는 메모리에 우선 할당되고 프로그램이 종료되면 사라진다.
		//---> 정적 : 메모리 고정 vs 동적: 인스턴스, mew(생성) , GC(자동삭제 - > 참조를 당하지 않으면)
		//---> 인스턴스가 없어도 이미 메모리(실체)가 존재하므로 바로 사용이 가능하다. static없는 변수나 메소드는 인스턴스가 필요하다.
		
	
	
	
	public static void main(String[] args) //throws Exception //메인으로 던질수도 있음
	{
		
		try {
		//1. 메소드 호출 , 예외처리 발생 : 호출한 메소드가 throws 이용하여 메소드 내부 예외를 반환했기 때문
		loadClass("a.txt", "java.lang.String");
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		//2. 메소드호출
		try {
		method();   // new Example3().method();함수가 static이 없을때 호출하는 방법
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		
	}//main end

}//class end
