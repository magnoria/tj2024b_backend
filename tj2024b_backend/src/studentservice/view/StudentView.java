package studentservice.view;

import java.util.Scanner;

import javax.lang.model.element.NestingKind;

import studentservice.controller.StudentController;
import studentservice.model.dto.StudentDto;

public class StudentView {
	
	//싱글톤
	private static StudentView instance = new StudentView();
	private StudentView() {}
	public static StudentView getInstance() {return instance;}
	
	private Scanner scan = new Scanner(System.in);
	
	// 함수실행 처음화면
	
	public void index() {
			System.out.println("출력화면 만들기");
		
		
		while(true) {
			
			System.out.println("1. 점수등록 2.점수삭제 3.점수수정");
			int choose = scan.nextInt();
			if (choose == 1) { studyup();
				
			}else if (choose == 2) {
				
			}else if (choose == 3) {
				
			}else if (choose == 4) {
				
			}// end
			
			
			
			
		}// w end
	}// f end
		
		//1. 점수 등록 메소드
		public void studyup() {
			System.out.println("이름:"); String name = scan.next();
			System.out.println("국어점수:"); String klang = scan.next();
			System.out.println("영어점수:"); String elang = scan.next();
			System.out.println("수학:"); String math = scan.next();
			StudentDto studentDto = new StudentDto(name, klang, elang, math);
			boolean result = StudentController.getInstance().studyup(studentDto);
			if (result) {System.out.println("점수등록성공");
				
			}else {
				System.out.println("점수등록실패");
			}
			
			
		}// f end
		
		//2.
		
		//public String choice() {
			//1. 입력
		//System.out.println("이름:"); String name = scan.next();
			
		//StudentDto studentDto = new StudentDto(name);
		
			
			
			
		}//f end
		
		
		
		
		
		
		
		
		

	
	
	

}//class
