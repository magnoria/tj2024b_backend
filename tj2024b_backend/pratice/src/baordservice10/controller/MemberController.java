package baordservice10.controller;

import baordservice10.model.dao.MemberDao;
import baordservice10.model.dto.MemberDto;

public class MemberController {
	//싱글톤
	
	private static MemberController instance = new MemberController();
	private MemberController() {}
	
	public static MemberController getInstance() {
		return instance;
	}


	
}// class end
