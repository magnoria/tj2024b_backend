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

	//회원가입 컨트롤러 메소드
	public boolean signup(MemberDto memberDto) {
		// 다양한 유효성검사를 넣을 예정
		boolean result  = MemberDao.getInstance().signup(memberDto);
		return result;
	}// f end
	
	
	
}// class end
