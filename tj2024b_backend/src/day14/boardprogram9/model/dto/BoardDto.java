package day14.boardprogram9.model.dto;

public class BoardDto {
	
	// - 싱글톤 x : 각 게시물 정보를 저장할 목적 이므로 서로 고유한 객체가 필요하다.
	
	//멤버변수
	private String title;
	private String content;
	private String writer;
	

	
	//생성자
	public BoardDto() {}
	public BoardDto(String title, String content, String writer) {// 중가로 안에 대가로 안에 넣는것을 넣고 있었음
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	//메소드
		//
	public String getTitle() {return this.title; }
	public String getContent() {return this.content;}
	public String getWriter() {return this.writer;}
	public void setTitle(String title) {this.title = title;}
	public void setContent(String content) {this.content = content;}
	public void setWriter(String writer) {this.writer= writer;}
	

}
