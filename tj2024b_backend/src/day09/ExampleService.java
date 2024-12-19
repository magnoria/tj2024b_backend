package day09;

import java.util.Iterator;
import java.util.Scanner;

public class ExampleService {
	
	void ExamPladd(Scanner scan, Examlist[] lists) {
		System.out.println(">번호를입력하세요 :"); int num = scan.nextInt();
		System.out.println("인원수명 :"); int peple = scan.nextInt();
		
		Examlist list = new Examlist();
		list.number = num;
		list.peple = peple;
		
		boolean saveState = false;
		for ( int index = 0; index <lists.length-1; index++) {
			if (lists[index] == null) {
				lists[index] = list;
				saveState = true;
				break;
			}
			
		}//for end
		if (saveState) {System.out.println("등록성공");
			
		}else {
			System.out.println("등록실패");
		}//if end
		
	}//voide end
	
	void ExamplePrint(Examlist[] lists) {
		System.out.println(">게시물 출력합니다.");
		for (int index=0; index<= lists.length-1; index++) {
			Examlist list = lists[index];
		if (list != null) {
			System.out.println("번호 :" + list.number + "인원" + list.peple);
			
		}	
			
		}
		
	}
	
	
	
}
