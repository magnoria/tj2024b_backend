package day14.Example2.model.dto;

public class MemberDto {
	//싱글톤
	//멤버변수 만들기
	//private String id;				//사원번호
	private String position;		//직위
	private String name;			//이름

	//생성자
	public MemberDto() {} // 생성자 만들기
	public MemberDto(String position, String name) {
		//this.id = id;
		this.position = position;
		this.name = name;
	}
	
	
	//메소드
	//public String getId() {return this.id;}
	public String getPosotion() {return this.position;}
	public String getName() {return this.name;}
	//public void setID(String id) {this.id = id;}
	public void setPosition(String position) {this.position = position;}
	public void setName(String name) {this.name = name;}

	

}
