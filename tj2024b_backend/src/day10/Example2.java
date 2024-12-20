package day10;

public class Example2 {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		//오류 발생 : 호출하고자하는 멤버변수가 pribate이므로 외부 클래스로 접근/호출 불가능
		//date.moth = 2;
		//date.dat = 31;
		//date.year = 2018;
		
		date.setDay(31);
		date.setDay(25);
		
		//주로 : 1. 저장할 데이터의 유효성 검사를 할때 주로 사용된다. 2.모든 필드(멤버변수)는 private 사용.(DTO,VO)
	}

}
