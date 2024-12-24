package day12;

import day10.Student2;

class Student{
	// 정적변수 : 프로그램 시작될때 1번 생성된다.
	public static int serialNum = 1000;
	
	// 멤버변수 : 인스턴스 생성할때마다 각 변수가 생성된다.
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	// + 생성자 p.184 
	
	// + 메소드
	public String getStudentName() {return studentName;}
	public void setStudentName(String name) {studentName = name;}
	
}// class end

class student1{
	
	// 정적변수 : 프로그램 시작될때 1번 생성된다.
		public static int serialNum = 1000;
		
		// 멤버변수 : 인스턴스 생성할때마다 각 변수가 생성된다.
		public int studentID;
		public String studentName;
		public int grade;
		public String address;
		// + 생성자 p.184 
		
		public student1() {
			serialNum++;	// 학생이 생성될때마다 1증가
			studentID = serialNum; // 증가된 값을 학번 멤버변수에 대입한다.
		}
		
		// + 메소드
		public String getStudentName() {return studentName;}
		public void setStudentName(String name) {studentName = name;}
		
	}// class end

class student2{
	// 정적변수 : 프로그램 시작될때 1번 생성된다.
			private static int serialNum = 1000;
			
			// 멤버변수 : 인스턴스 생성할때마다 각 변수가 생성된다.
			public int studentID;
			public String studentName;
			public int grade;
			public String address;
			// + 생성자 p.184 
			
			public student2() {
				serialNum++;	// 학생이 생성될때마다 1증가
				studentID = serialNum; // 증가된 값을 학번 멤버변수에 대입한다.
			}
			
			//반환함수 만들어야함
			public static int getSerialNum() {
				int i = 10;
				// teturn this.serialNum;   -> static은 공용이라 this를 쓸필요가 없다
				return serialNum;
			}
			
			public static void setSerialNum(int serialNum) {
				// this.serialNum = serialNum;  -> 여기도 마찬가지 비교해서 확인해보기
				student2.serialNum = serialNum;
			}
			
			// + 메소드
			public String getStudentName() {return studentName;}
			public void setStudentName(String name) {studentName = name;}
	
	
}
	
	
	


public class Example3 {
	public static void main(String[] args) {
		
	
	//인스턴스 생성
	Student studentLee = new Student();
	studentLee.setStudentName("이지원");
	System.out.println( studentLee.serialNum); // 1000
	studentLee.serialNum++; // 1증가
	
	//인스턴스 생성
	Student studentSon = new Student();
	studentLee.setStudentName("손수경");
	System.out.println(studentSon.serialNum); //1001
	System.out.println(studentLee.serialNum); //1001
	
	System.out.println(studentSon.studentName); //이지원
	System.out.println(studentLee.studentName);	//손수경
	
	// 예2]
	student1 student1Lee = new student1();
	studentLee.setStudentName("이지원");
	System.out.println(student1Lee.studentID); //1001
	
	student1 studentson1 = new student1();
	studentson1.setStudentName("손수경");
	System.out.println(studentson1.studentID);
	
	//예3] 클래스 변수 //클래스명.static변수명
	System.out.println(Student.serialNum);   //관례적으로 알수있는 이유는 class 명은 첫글자가 대문자이기 때문에
	System.out.println(student1.serialNum);
	
	//예4]
	//System.out.println(Student2.serialNum); // static 변수도 private 외부클래스 접근 불가능.
	System.out.println(student2.getSerialNum());
	
}
}//class end





/*
 클래스 2개 :  Student , Example3 
 인스턴스 2개 : new Student();,new Student();
 생성된멤버변수 : 8개
  	(studentID , studentName , grade , address)
  	(studentID , studentName , grade , address)
  	정적변수 : 1개
 */
 