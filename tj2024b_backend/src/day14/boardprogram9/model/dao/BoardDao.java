package day14.boardprogram9.model.dao;

import java.util.ArrayList;

import day14.boardprogram9.model.dto.BoardDto;

public class BoardDao {
		
	// 싱글톤
	private BoardDao() {}
	private static BoardDao instance = new BoardDao();
	public static BoardDao getInstance() {
		return instance;
	}
	
	// + 게시물 리스트 선언
	private ArrayList<BoardDto> boards = new ArrayList<>();
	//어제거랑 다른점은 ArrayList 를 사용하는것
	
	//1. 게시물쓰기 처리 함수
	public boolean create(BoardDto boardDto) {
		//[1] 매개변수로 받은 객체를 add() 이용하여 리스트에 저장
		boards.add(boardDto);
		//[2] 저장 결과 반환
		return true;
		// 가변길이라서 null이 안생기기 때문에 인덱스 검사를 할필요가 없다.
		//컨트롤러와 연결
	}
	
	//2. 게시물 반환처리 함수
	public ArrayList<BoardDto> readAll(){
		//[1] 모든게시물을 갖는 리스트 객체 반환
		return boards;
		//컨트롤러와 연결
	}
	
	//3. 게시물 수정 처리 함수
		public boolean update(int uIndex, BoardDto boardDto) {
			// [1] 리스트에 존재하지 않는 인덱스 이면 실패
			if (uIndex > boards.size()-1 || uIndex < 0) {
				//마지막 인덱스보다 크거나 음수인덱스(존재하지 않음) 이면
				return false;
			}
			//[2] 지정한 인덱스 새로운 객체 대입 , .set(인덱스 , 새로운 요소) 함수
			boards.set(uIndex, boardDto);
			//[3] 결과반환
			return true;
			
		}//f end
	
	
	//4. 게시물 삭제 처리 함수
	public boolean delete(int dindex) {
		// [1] 리스트에서 특정한 익덱스를 .remove()함수 이용하여 요소 삭제한다.
		if (dindex > boards.size() -1) { //length와 비슷하므로 -1 인덱스 숫자는 0부터 시작힉 때문
			//존재하지 않는 인덱스를 요청하면
			return false;//실패
		}
		boards.remove(dindex);// 삭제 함수 
		return true; //성공
	}// f end
		
	
	
}// class end
