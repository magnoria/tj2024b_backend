package studentservice.model.dto;

public class StudentDto {
	
	private String sname;
	private String klanguage;
	private String english;
	private String math;
	
	
	public StudentDto(String sname, String klanguage, String english, String math) {
		super();
		this.sname = sname;
		this.klanguage = klanguage;
		this.english = english;
		this.math = math;
	}
	
	
	
		// 점수확인용
	public StudentDto(String sname) {
		super();
		this.sname = sname;
		
	}

	
	
	
	
@Override
public String toString() {
	return "StudentDto [sname=" + sname + ", klanguage=" + klanguage + ", english=" + english + ", math=" + math + "]";
}






public String getSname() {
	return sname;
}






public void setSname(String sname) {
	this.sname = sname;
}






public String getKlanguage() {
	return klanguage;
}






public void setKlanguage(String klanguage) {
	this.klanguage = klanguage;
}






public String getEnglish() {
	return english;
}






public void setEnglish(String english) {
	this.english = english;
}






public String getMath() {
	return math;
}






public void setMath(String math) {
	this.math = math;
}







	
	

}// class end


