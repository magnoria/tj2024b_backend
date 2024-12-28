package day14.Example2.model.dao;

import java.util.ArrayList;

import day14.Example2.model.dto.MemberDto;

public class MemberDao {
	//Dto가 저장하는 장소라면 dao는 리스트저장 및 Controller에 보내기
	
	
	
	//dao에서만 활용할 함수 만들기
	private MemberDao() {} // 접근 불가하도록 private
	private static MemberDao instance = new MemberDao();//하나만 필요하므로 static으로 더이상 만들수 없게 사용시 instance
	public static MemberDao getInstance() {// 이것도 마찬가지
		return instance;
	}
	
	//게시물 리스트 선언
	private ArrayList<MemberDto> members = new ArrayList<>();// 배열이아닌 Array로
			
	
	
	//1. 게시물 쓰기 regist
	
	public boolean regist(MemberDto memberDto) {
	members.add(memberDto);// Arraylist일때 쓰는것 반환값 boolean
		
		return true;
		
	}
	
	//2. 게시물 반환 처리 함수
	public ArrayList<MemberDto> output(){
		return members;
	}
	
	//3. 게시물 수정 함수
	public boolean correction(int cindex, MemberDto memberDto) {
		if (cindex > members.size()-1 || cindex < 0) { // members 요소(배열을)꺼내온다
				//cindex가 members요소보다 크다면 - 매칭되는 요소가 없다면
			return false;
			
		}// if end
		members.set(cindex, memberDto);
		return true;
	}//f end
	
	//4. 게시물 삭제 함수
	public boolean delete(int dindex) { // 제거할 d인덱스를 controller에서 받아온다
		if (dindex > members.size()-1  ) {
			return false;
			
		}
		members.remove(dindex);//나열된 목록의 dindex를 제거한다.
		return true;
	}
	

	
	
	
	

}//class end
