package day13.boardprogram8.view;

import java.util.Scanner;

import day13.boardprogram8.controller.BoardController;
import day13.boardprogram8.model.dto.BoardDto;


public class BoardView {
	    //syso - 프린트 안된이유 함수안이 아니라서 실행 할 수가 없기때문
		//함수안은 실행가능 syso 자동 완성이 됨
	
	// + 싱글톤
	private BoardView() {}
	
	private static BoardView instance = new BoardView();
	public static BoardView getInstance() {
		return instance;
	}
	
	// - 싱클톤 end
	
	// + 멤버변수(입력객체 : 모든 메소드에서 사용하기 위해서)
	private Scanner scan = new Scanner(System.in);
	
	//1. 메인페이지 입출력 메소드   함수명 : 임의
	public void index() {
		
		
		while (true) {
			System.out.print("1. 글등록 2. 글출력 :");
			int choose = scan.nextInt();
			if (choose == 1) {write();
				
			}else if (choose == 2) {findAll();
				
			}
		}// while end
	
	}// f end
	
	//2. 글쓰기 입출력 메소드
	public void write() {
		System.out.println("[글쓰기 페이지]");
		//[1]입력
		System.out.print("제목:"); String title = scan.next();
		System.out.print("내용:"); String content = scan.next();
		System.out.print("작성자:"); String writer = scan.next();
		//[2]객체화
		BoardDto boardDto = new BoardDto(title, content, writer);
		
		//[3] 컨트롤러에게 저장할 객체를 전달하고 결과를 응답받기
		boolean result = BoardController.getInstance().write(boardDto);//컨트롤러에게 객체를 전달하고 결과를 응답받아 변수에 저장.
			if(result == true) {
				
			}else if (result == false) {
				
			}
	}// f end
	
	//3. 모든글 출력 입출력 메소드
	public void findAll() {
		System.out.println("[모든글 출력 페이지]");
		//[1] 컨트롤러에게 모든 게시물 정보를 요청하고 결과 받기
		BoardDto[] result = BoardController.getInstance().findAll();//컨트롤러에게 모든 게시물 정보 요청 결과 받기
		//[2] 요청 결과 출력하기
		for(int i =0; i <= result.length-1; i++) {
			BoardDto board = result[i];
			if (board != null) { // 이걸 null일 경우라고 써놓음
				System.out.printf("%d , %s, %s, %s",
					i,
					board.getTitle() ,
					board.getContent() ,
					board.getWriter());
			}
		}
	}// f end
}// class end
