package day18.step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Example1 {
	public static void main(String[] args) {
		
		//인터페이스 타입
		Connection connection;
		
		//[1] DB 연동
		//1. mysql JDBC 클래스 존재하는지 로드/불러오기 , Class.forName() : 클래스 로드 함수 , 일반 예외처리
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			//com.mysql.cj.jdbc : 패키지 경로 , Driver : 클래스명
			// mysql : com.mysql.cj.jdbc.Driver
			// oracle : oracle.jdbc.driver.OracleDriver
		//2. db서버와 연동시도
		connection =
		DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb0103","root", "1234"); //static이여서 new 함수로 안불러도 된다.
			//DriverManager : DB서버와 연동하는 클래스, import java.sql
				// -> 연동함수 : .getConnection("DB서버URL//db서버ip:db서버port/db명" , "DB서버계정명", "DB서버비밀번호")
					//--> 로컬 : .getConnection("jdbc:mysql://localhost :3306/DB명" , "root", "1234")
		
			System.out.println("[DB연동성공]");
		
		}catch (ClassNotFoundException e) {
			System.out.println("프로젝트내 jdbc드라이버가 존재하지 않습니다." + e);
		}catch (SQLException e) {
			System.out.println("DB연동실패 :" + e);
		}
		 
		
		
	}//main end

}// class end
