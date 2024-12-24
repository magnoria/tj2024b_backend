package day12.boardprogram7;
// boardProgram 1번부터 여기까지 쳐서 느낌을 외우기
import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class BoardService {
	
	//개시물 등록함수
	public void boardAdd(Scanner scan, BoardDto[] boards, String loginId) { // Scanner scan -> 타입이 Scanner 라서 쓴것 타입 변수를 써야 매개 변수가 됨
					System.out.println("제목 :"); String title = scan.next();
					System.out.println("내용 :"); String content = scan.next();
					System.out.println("작성자는 현재 로그인된 아이디로 대체 됩니다.");
					String writer = loginId; //로그인 아이디를 작성자에 대입한다.
					//생성자를 이용한 빠른 초기화 객체 생성
					BoardDto boardDto = new BoardDto(title, content, writer);
					//게시물 목록에서 빈 공간을 찾아서 대입
					for(int i = 0; i <= boards.length-1; i++) {
						if (boards[i] == null) {
							boards[i] = boardDto;
							System.out.println("개사물 등록 성공");
							return;
							
						}
					}
	}	
	
	//게시물 출력함수
	
	public void boardPrint(BoardDto[] boards) {// 여기는 함수 선언부라 type을 써야한다.
		System.out.println("순번\t작성자\t제목\t내용");
		for(int index = 0; index <= boards.length-1; index++) {
			if (boards[index] != null) {
				System.out.printf("%d \t %s \t %s \t %s \n",
					index,
					boards[index].getWriter() ,
					boards[index].getTitle() ,
					boards[index].getContent()
						);
			}
		}
	}
}
