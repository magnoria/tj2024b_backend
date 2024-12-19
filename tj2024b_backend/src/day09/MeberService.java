package day09;

import java.util.Iterator;
import java.util.Scanner;

public class MeberService { //회원객체가 사용하는 메소드를 설계하는 클래스
	
	void signup(Scanner scan, Member[] memberArray) {
		System.out.println("아이디 : "); String id = scan.next();
		System.out.println("비밀번호 : "); String pw = scan.next();
		System.out.println("닉네임 : "); String name = scan.next();
		Member member = new Member();
		member.id =id; member.pw =pw; member.name = name;
		
		for ( int index = 0; index <= memberArray.length-1; index++) {
				if () {
					
				}
			
		}
		
		
	}
	
	
	void login(Member[]memberArray) {
		
		for(int index = 0; index <= memberArray.length-1; index++; ) {
			
			
			
			
		}
		
		
		
		}// void end
		
	}

}// class end
