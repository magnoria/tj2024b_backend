package day10;

import java.util.Iterator;
import java.util.Scanner;

import javax.sql.RowSetListener;

public class PropilService {
	
	void login(Scanner scan, PropiLists[] lists) {
		System.out.println("> 아이디를 입력하세요 : "); String  neWid = scan.next();
		System.out.println("> 비밀번호를 입력하세요 : "); int neWnumBer = scan.nextInt();
		System.out.println("> 닉네임을 입력하세요 : "); String neWnic = scan.next();
		
		PropiLists list = new PropiLists();// 생성자
	    list.setId(neWid);
	    list.setNumber(neWnumBer); // 이거 아이디 두번넣고 있었음
	    list.setNic(neWnic);
	    
	    boolean save = false;
	    for (int index =0 ; index < lists.length-1; index++) {
	    	if (lists[index] == null) {
	    		lists[index] = list;
	    		save = true;
	    		break;
				
			}
	    }//for end
	    if(save) {System.out.println("등록성공");}
	    else {
			System.out.println("등록실패");
		}
	}//void end
	
	void LoginPrint(Scanner scan, PropiLists[] lists) {
		System.out.println("아이디를 입력해 주세요");
			String id = scan.next();
			
		System.out.println("비밀번호를 입력해 주세요");
		int num = scan.nextInt();
		
		boolean State = false;
		for ( int index = 0; index <= lists.length-1; index++) {
			if (lists[index] != null) {
				if( lists[index].getId().equals(id) && lists[index].getNumber() == num) {
					System.out.println("로그인성공");
					State = true;
					break;
				}
			}
			
		}// for end
		
		if (State) {System.out.println("로그인 성공");
			
		}
		else { System.out.println("로그인 실패");
			
		}
		
	
	}//void end

}//class end
