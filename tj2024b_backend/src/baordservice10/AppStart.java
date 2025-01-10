package baordservice10;

import baordservice10.view.MemberView;
import studentservice.view.StudentView;

public class AppStart {
	public static void main(String[] args) {
		
		
		// + 싱클톤의 메소드를 호출하는 방법 : 클래스명.getInstance().메소드명()
		StudentView.getInstance().index();
		
		
	}// m end
	
	
	
}//class end
