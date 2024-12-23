package day11;

import java.util.Scanner;

import day09.boardProgram4;

public class EampleSevice { //class s

	//1. 멤버변수 Dto에 존재
		
	//EampleDto succesUser; //[!] null값을 넣어야 한다고 되있으나 자바에서 type에 따라 자동 null값을 넣어줌
	
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
	
	
	
	

	
	void LoginSucces(Scanner scan, EampleDto[] logins ) { //로그인 메소드    // [!] void는 값을 반환하는 타입이 아니므로 rturn 값으로 값을 받을 수 없음
		System.out.print("아이디를 입력해주세요 : ");
			String id = scan.next();
			
		System.out.println("비밀번호를 입력해주세요 : ");
			int num = scan.nextInt();
			
		boolean State = false; //확인용
		for( int index = 0; index <= logins.length-1; index++) {
			if ( logins[index] != null) {
				if ( logins[index].getId().equals(id) && logins[index].getNum() == num) {
					//succesUser = logins[index]; // [!]전역변수 저장은 가능
					State = true;
					break;
					
					//return logins[index]; //   [!] return 값으로 logins[index]를 받아서 로그인한값을 가져가려고 했음
					
				}//if end 
			}//if end
		}// for end
		
		if (State) {System.out.println("로그인 성공"); 
			System.out.println("1. 게시물 등록 2. 게시물 출력"); 
			int choose = scan.nextInt();
			
			if (choose == 1) {
				System.out.print("게시물 등록 : ");
				String board = scan.next();
			}
			
			if (choose == 2) {
				System.out.println(board); // board 왜 출력이 안될까? scan으로 받아서?
				
			}
			
			
			
			//EampleDto boards = new EampleDto(); 수정
			//boards.setboard(board);
			
			
			
			
		}
		else {System.out.println("로그인 실패");
		 	
			
		}//if end
		
	}// Succes end
	
	
	
	
	
	
	
}
