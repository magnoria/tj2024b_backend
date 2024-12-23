package day11;

import java.util.Scanner;

public class EampleSevice { //class s

	//1. 멤버변수 Dto에 존재

	
	//2. 멤버함수인 메소드 구성
	//반환타입 함수명(타입 매개변수)
	void loginadd(Scanner scan, EampleDto[] logins ) {
		System.out.print("아이디 입력 :"); String id = scan.next();
		System.out.print("비밀번호 입력 :"); int num = scan.nextInt();
		System.out.print("닉네임 입력 :"); String nic = scan.next();
		
		EampleDto login = new EampleDto(); //객체 생성
		login.setId(id);
		login.setNum(num); // privait은 set으로 가져와야함 주의하기 계속 잊어먹음
		login.setNic(nic);
		
		
		// 3 객체를 배열에 저장
		boolean SaveState = false; //확인용
		for( int index = 0; index < logins.length-1; index++) {
			if(logins[index] == null) { // index 확인후 비어있는곳 찾기
				logins[index] = login; // 비어있는곳이 있으면 login정보 넣기
				SaveState = true;// 확인용
				break;// true 이면 멈춤
			}
			
			
		}//for end
		
		if (SaveState) {System.out.println("회원가입되었습니다.");
			
		}else {
			System.out.println("회원가입을 다시해주세요.");
			
		}//if end
		
	}// void end
	
	void LoginSucces(Scanner scan, EampleDto[] logins ) { //로그인 메소드
		System.out.print("아이디를 입력해주세요 : ");
			String id = scan.next();
			
		System.out.println("비밀번호를 입력해주세요 : ");
			int num = scan.nextInt();
			
		boolean State = false; //확인용
		for( int index = 0; index <= logins.length-1; index++) {
			if ( logins[index] != null) {
				if ( logins[index].getId().equals(id) && logins[index].getNum() == num) {
					System.out.println("로그인성공");
					State = true;
					break;
					
				}//if end 
			}//if end
		}// for end
		
		if (State) {System.out.println("로그인 성공");
			
		
			
		}
		else {System.out.println("로그인 실패");
		 	
			
		}//if end
		
	}// Succes end
	
	
	
	
	
}
