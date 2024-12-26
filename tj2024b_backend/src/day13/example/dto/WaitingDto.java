package day13.example.dto;

public class WaitingDto {
      //출력을 하려면 저장도 해야함
	
	//멤버변수
	private int num;
	private int delay;
	
	//생성자
	public WaitingDto() {}
	public WaitingDto(int num, int delay) {
		this.num = num;
		this.delay = delay;
		
		
	}// public end
	//메소드  dto 쓰는건 여러번 쳐볼것
	public int getNum() {return this.num;}
	public int getdelay() { return this.delay;}
	public void setNum(int num){this.num = num;}
	public void setdelay(int delay) {this.delay = delay;}
	
}
