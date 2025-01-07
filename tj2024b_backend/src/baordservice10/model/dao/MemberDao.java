package baordservice10.model.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import baordservice10.model.dto.MemberDto;

public class MemberDao { //DB와 연동결과를 조작하는 인터페이스
	private Connection conn; // conn은 인터페이스고 이것은 SQL을 조작하기 위해서 사용한다. 
	private String dbur1 = "jdbc:mysql://localhost:3306/boardservice10";
	private String dbuser = "root";
	private String dbpwd = "1234";
	
	
	
	private static MemberDao instance = new MemberDao();
	private MemberDao() {
		
		try {
			
		//1. JDBC 클래스 드라이버 로드 , class.forName(); * 예외처리 try{}catch(){}
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class는 앞에 대문자 틀리지 말것
		
		
		//2. 설정한 경로/계정/비밀번호 로 DB서버 연도 시도하고 결과를 (구현체)반환
		 conn = DriverManager.getConnection( dbur1 , dbuser , dbpwd);
		
		
		}catch(Exception e){
		System.out.println("db연동실패" + e);
		}
	}
	public static MemberDao getInstance() {return instance;}

	//1. 회원가입 SQL 처리 메소드
	public boolean signup(MemberDto memberDto) {
		
		try {
		//[1] SQL 작성한다
		String sql = "insert into member(mid, mpwd, mname , mphone) values ('"+memberDto.getMid()+"','"+memberDto.getMpwd()+"','"+memberDto.getMname()+"','"+memberDto.getMphone()+"')";
		
		
		//[2] DB와 연동된 곳에 SQL 기재한다. - sql을 기재하는 방법:conn.prepareStatement(sql)
		PreparedStatement ps = conn.prepareStatement(sql); //preparStatement 추상메소드는 누군가가 구체화 해줘야하고 이걸 구체화 시켜주는게 DriverManager이다.
		//PreparedStatement 추상메소드를 실행시킨다
		//PreparedStatement 인터페이스다 i로 써져있다.
		
		//[3] 기재된 SQL을 실행하고 결과를 받는다. - 기재된 sql을 실행하는 방법 : ps.executeUpdate();
		int conut = ps.executeUpdate(); //  executeUpdate 추상메소드 이다.
		
		//[4] 결과에 따른 처리 및 반환을 한다.
		if (conut == 1) { return true;}
		} catch (SQLException e) { System.out.println(e);}
		return false;
		
	}// f end
	
	
	
	
	
}//class end
