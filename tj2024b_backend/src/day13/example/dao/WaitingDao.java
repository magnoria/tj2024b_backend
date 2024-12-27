package day13.example.dao;

import day13.example.dto.WaitingDto;

public class WaitingDao {
	// 싱글톤
	private WaitingDao() {} //디폴트
	
	private static WaitingDao instance = new WaitingDao();
	//private로 접근불가 static 하나만 생성
	
	public static WaitingDao getinstance() {
		return instance;
	}// 사용하기 위해 getinstance만들어주고 리턴값
	
	private WaitingDto[] waitingDB = new W
	
	
	
	
	
	
}//class end
