package day14.Example2.view;

import java.lang.reflect.Member;
import java.rmi.registry.Registry;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

import day14.Example2.controller.MemberController;
import day14.Example2.model.dao.MemberDao;
import day14.Example2.model.dto.MemberDto;

public class MemberView {

	private MemberView() {}
	private static MemberView instance = new MemberView();
	public static MemberView getInstance() {return instance;}
	
	
	private Scanner scan = new Scanner(System.in);
	
	
	//메인 표현
	public void index() { // index 헷갈려서 main 으로 변경
		
		while (true) {
			System.out.print(" 1. 사원등록 2. 로그인 3. 사원수정 4. 사원삭제");
			int choose = scan.nextInt();
			if (choose == 1) {regist();
				
			}else if (choose == 2) {output();
				
			}else if (choose == 3) {correction();
				
			}else if (choose == 4) {delete();
				
			}
			
		}//while
		
	}// f end
	
	//2. 사원등록 함수
	public void regist() {
		//System.out.println("사원번호:"); String id = scan.next();
		System.out.println("직위:"); String postion = scan.next();
		System.out.println("이름:"); String name = scan.next();
		
		MemberDto memberDto = new MemberDto(postion, name);
		
		boolean result = MemberController.getInstance().regist(memberDto);
		
		
		
		
			
		
		//받은 결과 메시지 출력
		if (result) {System.out.println("[저장되었습니다.]");
		
		ArrayList<MemberDto> check = MemberController.getInstance().output(); //전체데이터 가져오기
		
		MemberDto newMember = check.get(check.size()-1); //새로 저장된 데이터 가져오기(마지막 데이터)
			
			
			System.out.printf("사원번호:%d\n 사원직위:%s\n 사원이름:%s\n",
					check.size(), newMember.getPosotion(), newMember.getName());
			//리스트에 영향을 안끼치고 저장된것만 보여주기
			
			
		}else {
			System.out.println("저장실패했습니다.");
		}
		
		
	}//f end
	
	//3. 출력// 여기를 로그인으로 변경해야함 output을 login으로 변경
	//사원번호가 위에 출력되고 그다음에 직위 그다음에 이름 출력
	
	
	
	
	
	
	//4. 사원수정
	public void correction() {
		System.out.println("사원수정");
		
		//수정정보
		System.out.print("수정할 사원번호:");
			int cindex = scan.nextInt();
		//System.out.println("수정할 사원번호");
			//String id = scan.next();
		System.out.println("수정할 직위:");
			String position = scan.next();
		System.out.println("수정할 이름:");
			String name = scan.next();
		//입력받은 값들을 객체로 만든다.
		MemberDto memberDto = new MemberDto(position,name);
		
		//수정인덱스 및 수정할 객체
		boolean result = MemberController.getInstance().correction(cindex, memberDto);
		//결과에따른 메시지 출력
		if (result) {
			System.out.println("수정완료");
		}else {
			System.out.println("수정실패");
		}
		
		
	}//f end
	
	
	// 사원 삭제 함수
	public void delete() {
		System.out.println("사원정보를 삭제합니다");
		
		//삭제할 인덱스번호 입력
		System.out.println("삭제할 사원번호:"); int dindex= scan.nextInt();
		
		boolean result = MemberController.getInstance().delete(dindex);
		if (result) {System.out.println("사원삭제가 성공했습니다.");
			
		}else {
			System.out.println("사원삭제가 실패했습니다.");
		}
		
		
		
	}
	
	//전체출력 리스트확인용
	public void output() {
		ArrayList<MemberDto> result = MemberController.getInstance().output();
		
		for ( int i=0; i <= result.size()-1; i++) {
			MemberDto members = result.get(i);
			System.out.printf("%d \t %s \t %s \n",
					i,members.getPosotion(),members.getName());
			
		}
		
	}
	
	
	
	
	
}//class end
