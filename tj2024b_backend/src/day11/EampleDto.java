package day11;

public class EampleDto {
	
	// 클래스 멤버
	
	//1. 멤버변수 , 접근제한자 , 객체속성
	
	private String id;
	private int num;
	private String nic;
	
	//2. 생성자 , 객체 생성시 초기화 담당, new 생성자()
		// + 디폴트 생성자 규칙
			// 1. 클래스명과 동일 2. 매개변수와 인수값 타입 /개수 일치
	
	//1. 디폴트 생성자 , 없어도 되지만 만들어두는게 관례
	public EampleDto() {}
	
	//2. (전체) 매개변수가 3개인 생성자 - 외부에서 private를 사용하게 하기 위해
	public EampleDto(String id, int num, String nic) {
		this.id = id;
		this.num = num;
		this.nic = nic;
	}
	
	//3. 메소드 //멤버함수 , 객체가 실행할 함수 정의
		// 1.getter and setter : private 멤버변수를 다른 클래스로부터 간접 접근 제공 함수
		public String getId() {return this.id;}
		public void setId(String id) {this.id = id;} //참조안된 첫번째 문제점 setid로 했음 set,get은 처음은 대문자로
		
		public int getNum() {return this.num;}
		public void setNum(int num) {this.num = num;}
		
		public String getNic() {return this.nic;}
		public void setNic(String nic) {this.nic = nic;}
	
	
	
}//class end
