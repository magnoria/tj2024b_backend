package day13.boardprogram8.model.dao;

import day13.boardprogram8.model.dto.BoardDto;

public class BoardDao {
	// +싱글톤
	 private BoardDao() {} //디폴트 생성자에 private
	 private static BoardDao instance = new BoardDao();
	 public static BoardDao getinstance() {
		 return instance; 
	 }
	 
	 //+ 멤버변수(데이터베이스 역할 배열 만들기)
	 private BoardDto[] boardDB = new BoardDto[100];
	 
	 
	 //1. 글쓰기 처리 메소드 , 함수명 : 임의 , 매개변수 : BoardDto, 리턴값 :true/false
	 public boolean write(BoardDto boardDto) {
		 //[1] 매개변수로 받은 저장할boardDto를 배열에 저장한다.
		 for(int index = 0; index <= boardDB.length-1; index++) {
			 if (boardDB[index] == null ) {
				boardDB[index] = boardDto;
				return true;
			}
		 }
		 
		 return false; //이걸 안써서 오류가 생겼음 boardDto가 인식이 안됬고 write가 boolean 으로인식을 해야하는 데 못해서 오류가 생김
		 //[2]결과를 controller 응답한다.
	 }
	 
	 
	 
	 //2. 모든글 출력 처리 메소드 , 함수명 : 임의 , 매개변수 : x, 리턴값 : BoardDto[]
	 public BoardDto[] findAll() {
		 return boardDB;
		 // [1] 배열내 모든 객체를 controller 에게 응답한다.
	 }
	
	// - 싱글콘
}
