package day13;

public class Example1 {
	public static void main(String[] args) {
		
	
	// 단계 4 : 싱클톤 호출
	
	Company myCompany1 = Company.getInstance();
	Company myCompany2 = Company.getInstance();
	
	// - 두 변수가 참조하는 (갖는)객체는 동일한 (싱글톤)객체 이다.
	System.out.println(myCompany1); //day13.Company@5305068a
	System.out.println(myCompany2);	//day13.Company@5305068a
	
	// 참고 : 다른 클래스에서 Compny객체를 만들 수 없다.
	//Company myCompany3 = new Company(); // 클래스가 satice이라서 오류뜸
	
	// 참고2 : 싱클톤을 사용하는 객체의 메소드 호출
	Company.getInstance().method();
		// 실행순서1 :Company.getInstance() => 싱글톤(instance)반환
		// 실행순서2 : instance.method();
		// 클래스 만든 함수나 라이브러리 함수를 확인 할때는 매개변수와 반환값을 보고
		// 어떤 건지 어느정도 번역해서 보기
	}
}
