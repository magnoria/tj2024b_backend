package day10;

import java.util.Scanner;

public class PropilService {
	
	void login(Scanner scan, PropiLists[] lists) {
		System.out.println("> 아이디를 입력하세요 : "); String id = scan.next();
		System.out.println("> 비밀번호를 입력하세요 : "); int numBer = scan.nextInt();
		System.out.println("> 닉네임을 입력하세요 : "); String nic = scan.next();
		
		PropiLists list = new PropiLists();
		list.Id = id;
	}

}//class end
