package day12.boardprogram7;

import java.util.Iterator;
import java.util.Scanner;

public class MemberService {
	//1. 멤버변수 //2. 생성자
	//3. 메소드 기능만 제공하는 class로 만들어서 함수만 정리
	public void signUp(Scanner scan, MemberDto[] members) {
		System.out.println("아이디 : ");  String id = scan.next();
		System.out.println("비밀번호 : "); String pwd = scan.next();
		System.out.println("닉네임 : "); String name = scan.next();
		//객체화 , 생성자 이용한 빠른 객체 생성
		MemberDto memberDto = new MemberDto(id, pwd, name); //여기 매개변수 누락되면 오류뜸
		// 반복활용한 회원목록에서 빈공간 찾기
		for(int index=0; index <= members.length-1; index++) {
			if (members[index] == null) {
				members[index] = memberDto;
				System.out.println("회원가입성공");
				return;
			}
		}
	}// f end
	
	public String login(Scanner scan, MemberDto[] members) { // 반환타입이 void이므로 String올 바꿔야한다.
		System.out.println("아이디 : "); String id = scan.next();
		System.out.println("비밀번호 : "); String pwd = scan.next();
		//기존 회원목록에서 방금 입력받은 값고 비교하여 동일값 찾기
		for(int i = 0; i <= members.length-1; i++) {
			MemberDto memberDto = members[i];
			if (memberDto != null) {
				if (memberDto.getId().equals(id)&& memberDto.getPwd().equals(pwd)) {
					System.out.println("로그인성공");
					return memberDto.getId(); //로그인 성공한 아이디 반환
				}//if end
				
			}//if end
		}//for end
		System.out.println("로그인실패");
		return null;
		
	}// f end
	
	
}//class end
