package studentservice.controller;

import baordservice10.model.dto.MemberDto;
import studentservice.model.dao.StudentDao;
import studentservice.model.dto.StudentDto;

public class StudentController {
	private static StudentController instance = new StudentController();
	private StudentController() {}
	public static StudentController getInstance() {return instance;}

	
	// 점수입력 컨트롤러
	public boolean studyup(StudentDto studentdto) {
		
		boolean result = StudentDao.getInstance().studyup(studentdto);
		return result;
		
		
	}// f end

	
	
	
	
	
	
}// class end
