package baordservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import baordservice10.model.dto.MemberDto;


// dao와 dto는 model로 묶여있다 그이유는 두개가 유기적으로 연결되있기 때문인듯
//dto는 sql에 사용할 변수 및 값을 저장하는 용도
//dao 는 그런 변수로 sql언어로 서버와 연결하여 데이터를 넣거나 빼오는 용도
//controller는 그런 값들을 view와 연동하여 dao로 가져오거나 view로 데이터를 옮겨주는 용도
//여기서 팀프로젝트에서 생각할것은 
// 1.서버에서 값을 가져와서 화면으로 출력해주는것
// 2. 화면에서 값을 가져와서 서버에서 삭제해주는 것
// 3. 화면에서 값을 가져와서 서버에서 값을 변경해주는것 


public class MemberDao { //DB와 연동결과를 조작하는 인터페이스
	
protected Connection conn;		// DB와 연동 결과를 조작하는 인터페이스 
	
	private String dburl = "jdbc:mysql://localhost:3306/boardservice10"; // 연동할 DB 서버의 URL
	private String dbuser = "root"; // 연동할 DB 서버의 계정명
	private String dbpwd = "1234"; 	// 연동할 DB 서버의 비밀번호 
	
	public MemberDao() {
		try {
			// 1. JDBC 클래스 드라이버 로드 , Class.forName() * 예외처리 try{}catch(){}
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. 설정한 경로/계정/비밀번호 로 DB 서버 연동 시도 하고 결과를 ( 구현체 ) 반환 
			conn = DriverManager.getConnection( dburl , dbuser , dbpwd );
		}catch (Exception e) {
			System.out.println("[DB 연동 실패]" + e );
		}
	} 
	
	// 커넥션으로 자바에서 MYSQL에 서연동을 시도한다. 그렇기에 아이디와 비밀번호 url값을 드라이브 매니저가 커넥션으로 값들을 얻은후 conn에 넣는다
	
	
	
	
	//싱글톤
	private static MemberDao instance = new MemberDao();
	
	public static MemberDao getInstance() {return instance;}
	
	//1. 회원가입 메소드
	public boolean signup(MemberDto memberDto) {
		
		try {
		String sql = "insert into member(mid, mpwd, mname , mphone) "
				+ "values( '"+memberDto.getMid()+"' , '"+memberDto.getMpwd()+"', '"+memberDto.getMname()+"', '"+memberDto.getMphone()+"' )";
		// MemberDto 변수값들을 sql에 넣는다 instance가 있으므로 3개를 묶어서 가져올수 있었고
		//매개변수로 가져온 값을 sql에 넣는것임 
		
		
		
		PreparedStatement ps = conn.prepareStatement(sql);
		       //conn 은 커넥션이므로 커넥션으로 sql에 넣은 값들을 ps에 넣고 
			
		
		int count = ps.executeUpdate(); //updat는 insert updat delte에 사용되므로 sql자체에 넣는걸 생각하면 될듯
									// 그 결과 값을 가져온거고 그걸 카운트에 넣는다 int로 가져오는걸보니 넣는데 성공하면 값이 1이고
		if (count == 1) { return true;}// 그래서 카운트가 1이면 true
		}catch (SQLException e) {
			System.out.println(e);
		}
		return false;//아니면 false
	}
	
	
	
}//class end
