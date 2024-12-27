package day14.boardprogram9.view;

import java.util.ArrayList;
import java.util.Scanner;

import day14.boardprogram9.controller.BoardController;
import day14.boardprogram9.model.dto.BoardDto;

public class BoardView {
	// 싱글톤
	private BoardView() {}
	private static BoardView instance = new BoardView();
	public static BoardView getInstace() {return instance;}
	// 굳이 동일한 함수를 여러개 만들 필요가 없어서 싱글톤을 만들어서 사용
	
	
	//입력객체(현재 클래스내부의 모든 함수들에서 사용하기 위해 멤버변수에 선언)
	private Scanner scan = new Scanner(System.in);
	
	
	//1. 메인페이지 표현
	public void run() {
		
		
		while (true) {
			System.out.print("게시물 1.C 2.R 3.U 4.D:");
			int choose = scan.nextInt();
			if (choose == 1) {create();
				
			}else if (choose == 2) {readAll();
				
			}else if (choose == 3) {update();
				
			}else if (choose == 4) {delete();
				
			}
		}//while end
		
		
	}//f end
	
	
	//2. 게시물 쓰기 페이지 함수
	public void create() {
		System.out.println("title :"); String title = scan.next();
		System.out.println("content :"); String content = scan.next();
		System.out.println("writer :"); String writer = scan.next();
		//[2] 게시물 정보를 하나의 객체로 만든다  생성자를 이용하여 빠른 초기화
		BoardDto boardDto = new BoardDto(title, content, writer);
		//[3] 객체를 컨트롤러에게 전달하고 쓰기 결과를 받는다
		boolean result = BoardController.getInstance().create(boardDto);
		// [4] 받은 결과에 따른 메시지를 출력한다.
		if (result) {System.out.println("[save success] ");
			}else {	System.out.println("[save fail]");	}
		
	//순서	
	// [1] 저장할 게시물 정보를 입력받는다.
	// [2] 게시물 정보를 하나의 객체로 만든다.
	// [3] 객체를 컨트롤러에게 전달하고 쓰기 결과는 받는다.
	// [4] 받은 결과에 따른 메시지를 출력한다.
		
		
	}//f end
	
	
	//3. 출력페이지 함수
	public void readAll() {
		System.out.println("[R]");
		// [1] 컨트롤에게 모든 게시물 정보를 요청한다.
		ArrayList<BoardDto> result = BoardController.getInstance().readAll();
		// [2] 요청받은 모든 게시물 정보를 출력한다.
		System.out.println("순번\t작성자\t제목\t내용");
		for(int i=0; i <= result.size()-1; i++) {
			BoardDto board = result.get(i);
			System.out.printf("%d \t %s \t %s \t %s \n" // 의미없는 슬레시가 하나 들어감
					,i, board.getWriter(), board.getTitle(), board.getContent());
		}
	}
	
	
	// [1] 컨트롤에게 모든 게시물 정보를 요청한다.
	// [2] 요청받은 모든 게시물 정보를 출력한다.
	
	//4. 게시물 수정페이지 함수
	public void update() {
		System.out.println("[U]");
		//[1] 수정할 정보들을 입력받는다.
		System.out.print("update Index :");
			int uIndex = scan.nextInt();
		System.out.print("update Title :");
			String title = scan.next();
		System.out.print("update Content :");
			String content = scan.next();
		System.out.print("update writer :");
			String writer = scan.next();
		//[2] 입력받은 값들을 객체로 만든다.
		BoardDto boardDto = new BoardDto(title,content,writer);
		//[3] 컨트롤러에게 수정할 인덱스와 수정할 객체를 전달하고 결과를 받는다.
		boolean result = BoardController.getInstance().update(uIndex, boardDto);
		//[4]결과에 따른 메시지 출력한다.
		if (result) {System.out.println("[update success]");
			
		}else {
			System.out.println("[update fail]");
		}
	}
	
	
	//5. 게시물 삭제페이지 함수
	public void delete() {
		System.out.println("[D]");
		
		//[1] 삭제할 인덱스(식별)번호를 입력받는다.
		System.out.print("delete Index :"); int dIndex = scan.nextInt();
		//[2] 삭제할 번호를 컨트롤에게 전달하고 처리 결과를 받는다.
		boolean result = BoardController.getInstance().delete(dIndex);
		//[3]처리 결과에 따른 메시지 출력한다.
		if (result) {System.out.println("[delete success]");
			
		}else {System.out.println("[delete fail]");
			
		}
	}
}
