package example.dao;

import java.util.Iterator;

import example.dto.WaitingDto;

public class WaitingDao {
	// 싱글톤
	private WaitingDao() {} //디폴트시 public이 되기에 private로 만듬
	
	private static WaitingDao instance = new WaitingDao();
	//prtvate로 접근불가 static 하나만 생성
	
	public static WaitingDao getinstance() {
		return instance;
	}//사용을 하기위해 getinstance만들어주고 리턴값
	
	//멤버변수
	private WaitingDto[] waitingDB = new WaitingDto[100];// 여길 WaitingDao로함
	
	//입력값 처리
	public boolean pepleList(WaitingDto waitingDto) {
		//매개변수로 받을 배열만들기
		for(int i = 0; i <= waitingDB.length-1; i++) {
			if (waitingDB[i] == null) { //여기 DB에 [i]안넣음
				waitingDB[i] = waitingDto;
				return true;
				
			}
		}//for end
		return false;
		
	}//phon end
	
	public WaitingDto[] allFrint() {
		return waitingDB;
	}


	}//class end

