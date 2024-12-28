package day14.Example2.controller;

import java.lang.classfile.instruction.ReturnInstruction;
import java.util.ArrayList;

import day14.Example2.model.dao.MemberDao;
import day14.Example2.model.dto.MemberDto;

public class MemberController {
	//여기서 사용할 싱글톤
	private MemberController() {}
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {return instance;}
	
	
	//1. 게시물 제어
	public boolean regist(MemberDto memberDto) {
		boolean result = MemberDao.getInstance().regist(memberDto);//regist dto 받아오기
		return result;
	}
	
	//2. 출력제어 
	public ArrayList<MemberDto> output(){
		ArrayList<MemberDto> result = MemberDao.getInstance().output();//모든게시물을 보냄으로 
		//매개변수를 받아올게 없음??  이거 해석정리하기
		return result;
	}
	
	//2-1. 로그인 제어
	public ArrayList<MemberDto> login(){
		ArrayList<MemberDto> result = MemberDao.getInstance().login();//모든게시물을 보냄
		return result;
	}
	
	
	
	
	//3. 수정함수
	public boolean correction(int cindex, MemberDto memberDto) {
		boolean result = MemberDao.getInstance().correction(cindex, memberDto);
		return result;
		
	}
	
	//4. 삭제함수
	public boolean delete(int dindex) {
		boolean result = MemberDao.getInstance().delete(dindex);
		return result;
		
		}
	
	
	
	
	
	
	
	
	
	

}//class end
