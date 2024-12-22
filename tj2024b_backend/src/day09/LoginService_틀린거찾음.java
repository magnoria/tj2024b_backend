package day09;

import java.util.Iterator;
import java.util.Scanner;

public class LoginService_틀린거찾음 {
	
	void Loginadd(Scanner scan, LoginList[] lists) {
		System.out.println(">아이디를 입력하세요 :"); String id = scan.next();
		System.out.println(">비밀번호를 입력하세요 :"); int numBer = scan.nextInt();
		System.out.println(">닉네임을 입력하세요 :"); String nic = scan.next();
		
		LoginList list = new LoginList();
		list.id = id;
		list.numBer = numBer;
		list.nicName = nic;
		
		boolean saveState = false;
		for (int index=0; index < lists.length-1; index++) {
			if (lists[index] == null) {
				lists[index] = list;
				saveState = true;
				break;
				
			}
		}//for end
		if (saveState) {System.out.println("등록성공");
			
		}else {
			System.out.println("등록실패");
		}// if end
		
		
	}//void end
	
	void LoginPrint(Scanner scan, LoginList[] lists) {
		System.out.println("아이디를 입력해 주세요");
		 	String id = scan.next();
		 	
		System.out.println("비밀번호를 입력해 주세요");
			int num = scan.nextInt();
			
		for (int index = 0; index < lists.length-1; index++) {
			
			LoginList list = lists[index];
			
			if (list.id == id && list.numBer == num) {
				System.out.println("로그인되었습니다.");
				
			}else if (list.id != id && list.numBer != num ) {//여기가 안됬음 반복을 다해보고 확인을 해야함
				System.out.println("로그인을 실패하였습니다.");
				
			}
		
			
		}// for end
		
	}
	/*
	 * 1. 기본타입 : boolean char byte short int log float double
	 * 			==기본타입 비교
	 * 2. 참조/클래스 타입 : String , Scanner, Member , MemberService
	 * 			.equals() 참조타입 비교 함수*/
	
	
	

}// class end
