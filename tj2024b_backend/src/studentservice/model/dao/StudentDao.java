package studentservice.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import studentservice.model.dto.StudentDto;

public class StudentDao {
	
	public Connection conn;
	private String dbur1 = "jdbc:mysql://localhost:3306/boardservice10";
	private String dbuser = "root";
	private String dbpwd = "1234";
	
	public StudentDao() {
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection( dbur1 , dbuser , dbpwd );
		}catch (Exception e) {
			System.out.println("연동실패" + e);
		}
		
	}
	
	//싱글톤
	private static StudentDao instance = new StudentDao();
	public static StudentDao getInstance() {return instance;}
	
		
	// 메소드	
	
	
	
	
	//1. 점수 등록 메소드
	public boolean studyup(StudentDto studentDto){
		
		try {
	
	String sql = "insert into member(sname, klanguage, english , math) values ('"+studentDto.getSname()+"','"+studentDto.getKlanguage()+"',"
			+ "'"+studentDto.getEnglish()+"','"+studentDto.getMath()+"')";
	
	PreparedStatement ps = conn.prepareStatement(sql);
	 int count = ps.executeUpdate();
	 if (count ==1) { return true;}
	
		
		}catch (Exception e) {
		
		}
		return false;
	
	}//f end
	
	
	
	
	
	
	
	//3. 점수삭제 메소드
	
	
	
	
	
}//class
