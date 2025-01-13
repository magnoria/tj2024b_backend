package day24;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		
		
		//  해당 타입들의 클래스 정보를 JVM으로 가져오는 방법
		//[1]. .getClass() 메소드
		String s = new String();
		Class c = s.getClass();
		System.out.println(c); //class java.lang.String
		
		
		
		Integer i =  3;
		Class c1 = i.getClass();
		System.out.println(c1); //class java.lang.Integer
		
		//[2] .Class
		Class c2 = String.class;
		System.out.println(c2);
		//class java.lang.String
		
		//[3] Clas.forName("클래스이름");
		try {// try 예외처리
		Class.forName("java.lang.String");
		}catch (ClassNotFoundException e) {	}
		
		
		//[-]
		try {
		Class.forName("com.mysql.cj.jdbc.Driver"); // 지정한 클래스의 정보를 가져오기 위해서 -> 외부 라이브러리의 클래스 정보를 가져올때
		}catch (ClassNotFoundException e) {	}
		
		// 클래스 정보(클래스멤버=멤버변수/생성자/메소드)를 반환하는 함수.
		Field[] fields = c.getFields();
		for(int index = 0; index <= fields.length-1; index++) {
			System.out.println(fields[index]);
		}
		
		//
		Constructor[] constructors = c.getConstructors();
		for(int index = 0; index <= constructors.length-1; index++) {
			System.out.println(constructors[index]);
		}
		
		//
		Method[] methods = c.getMethods();
		for(int index =0; index <= methods.length-1; index++) {
			System.out.println(methods[i]);
		}
		
		
	}// main end

}// class end
