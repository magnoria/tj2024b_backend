package example.controller;

import example.dao.WaitingDao;
import example.dto.WaitingDto;

public class WaitingController {
	//싱글톤
	private WaitingController() {}
	private static WaitingController instance = new WaitingController();
	public static WaitingController getinstance() {
		return instance;
	}

	//입력값 제어
	public boolean pepleList(WaitingDto waitingDto) {
		boolean result = WaitingDao.getinstance().pepleList(waitingDto);
		return result;
	}//peple end
	
	//출력 제어
	public WaitingDto[] allFrint() {
		WaitingDto[] result = WaitingDao.getinstance().allFrint();
		return result;
	}//w
	
	
	
}//class end
