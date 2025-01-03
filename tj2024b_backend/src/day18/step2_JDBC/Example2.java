package day18.step2_JDBC;

public class Example2 {
	public static void main(String[] args) {
		
		//[확인]
		Dao.getInstace();
		
		//[insert 확인]
		Dao.getInstace().insert();
		
		
		//[select 확인]
		Dao.getInstace().select();
		
		//[update 확인]
		Dao.getInstace().update();// 실행함수를 빼먹음
		
		//[delete 확인]
		Dao.getInstace().delete();
		
		Dao.getInstace().select();		
		
		
		
		
	}//main end

}// class end
