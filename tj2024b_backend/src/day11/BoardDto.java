package day11;

//(2) 게시물 정보를 갖는 객체의 설계 클래스
public class BoardDto {//class start

	//* 클래스 멤버
	
	//1. 멤버변수  , 접근제한자 , 객체 속성
	private String title; //제목		//private은 다른 클래스로부터 접근차단
	private String content; // 내용
	private String writer;	// 작성자
	
	
	//2. 생성자 , 객체 생성시 초기화 담당 , new 생성자()
		// + 디폴트 생성자 규칙 : 1.클래스명과 동일 2. 매개변수 와 인수값 타입/개수 일치
		// 왜 두개를 만들었나??
	
		//1. 디폴트 생성자
public BoardDto() { }	
		
		//2. (전체) 매개변수가 3개인 생성자
	public BoardDto(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
		
	
	
	
	
	//3. 메소드 // 멤버함수 , 객체가 실행할 함수 정의
		// 1. getter and setter : private 멤버변수를 다른 클래스로부터 간접 접근 제공 함수
	
	public String getTitle() { return this.title; } // 왜 여기에는 retun이 들어가는가
	public void setTitle(String title) {this.title = title;}
	
	public String getContent() {return this.content;}
	public void setContent(String content) {this.content = content;}
	
	public String getWriter() { return this.writer;}
	public void setWriter(String writer) {this.writer = writer;}
}// class end
