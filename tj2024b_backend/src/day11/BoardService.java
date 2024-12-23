package day11;

import java.util.Scanner;

public class BoardService {
	
	//3. 게시물 등록
	public void boardAdd( Scanner scan, BoardDto[] boards) {
		System.out.println("제목 :"); String title = scan.next();
		System.out.println("내용 :");	String content = scan.next();
		System.out.println("작성자 :");	String writer = scan.next();
		
		//생성자를 이용한 객체 생성
		BoardDto boardDto = new BoardDto(title, content, writer);
		//배열저장
		boolean saveState = false;
		for(int index = 0; index <= boards.length-1 ; index++) {
			if(boards[index] == null) {
				boards[index] = boardDto;
				saveState = true; // 확인하는것
				break;
			}
		}
		if( saveState) {System.err.println("등록성공");}
		else {System.err.println("등록실패");}
	}
	//3-2. 모든게시물 출력
	public void boardPrint(BoardDto[] boards) {
		for(int index = 0; index <= boards.length-1; index++) {
			if(boards[index] != null) {
				System.err.printf("제목 : %s ,내용 :%s , 작성자 : %s" ,
						boards[index].getTitle() ,
						boards[index].getContent(),
						boards[index].getWriter() );
			}
		}
	}

}
