package day10;

public class Example1 {
	public static void main(String[] args) {
		
		// [1]
			//1.
		Student s1 = new Student();
		s1.studentId = 1;
		s1.studentName = "유재석";
		s1.KoreaScore = 89;
		s1.mathScore = 73;
		s1.KoreaSubject = "국어";
		s1.masthSubject = "수학";
			//2.
		Student s2 = new Student();
		s2.studentId = 2;
		s2.studentName = "강호동";
		s2.KoreaScore = 92;
		s2.mathScore = 78;
		s2.KoreaSubject = "국어";
		s2.masthSubject = "수학";
		
		//[2]
		Student2 s3 = new Student2();
		s3.StudentID = 3;
		s3.studentName = "신동엽";
			Subject sub1 = new Subject();
			sub1.subjectName = "국어";
			sub1.scorePoint = 89;
		s3.korea = sub1;
			Subject sub2 = new Subject();
			sub2.subjectName = "수학";
			sub2.scorePoint = 73;
		s3.math = sub2;
		
		
		
	}

}
