package day10;

import java.util.Scanner;

import javax.sql.RowSetListener;

public class PropilService {
	
	void login(Scanner scan, PropiLists[] lists) {
		System.out.println("> 아이디를 입력하세요 : "); String id = scan.next();
		System.out.println("> 비밀번호를 입력하세요 : "); int numBer = scan.nextInt();
		System.out.println("> 닉네임을 입력하세요 : "); String nic = scan.next();
		
		PropiLists list = new PropiLists();
	    list.setId(id);
	    list.setId(numBer);
	    list.setNic(nic);
	    
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

}//class end
