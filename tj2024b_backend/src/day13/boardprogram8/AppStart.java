package day13.boardprogram8;

import day13.boardprogram8.view.BoardView;

public class AppStart {
	public static void main(String[] args) {
		
		// + 싱글톤의 메소드 호출
		BoardView.getInstance().index(); // 화면의 함수호출은 한번만한다.
		// new BoardView().index(); 같은 느낌으로 해석
		
		
		
	}// main end
}// class end
