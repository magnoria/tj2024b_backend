package example.view;


import java.util.Scanner;

import example.controller.WaitingController;
import example.dto.WaitingDto;


public class WaitingView {
	
	//view 화면 출력관련 함수 정리
	
	//싱글톤
	private WaitingView() {}// 디폴트 생성자가 public이 되기때문에 만들어 놓음
	// 출력화면은 인스턴스가 하나면 되기 때문
	
	
	private static WaitingView instance = new WaitingView();
	//static으로 만들어서 하나만 만들수 있게끔
	
	public static WaitingView getInstance() {
		return instance;
	}// 외부에서 인스턴스를 참조할수 있도록 함수로 구현
	
	
	// 멤버변수
	private Scanner scan = new Scanner(System.in);
	//이곳에 출력을 구현하기때문에 다른곳에 만들기가 애매함
	
	//1. 메인페이지 입출력 메소드
	public void outIndex() {
		
		while (true) {
		
		System.out.println("1.등록 2.출력");
		int choose = scan.nextInt();
		if (choose == 1) { pepleList();
			
		}else if (choose == 2) {}
		
		
		}//while end
		
	}// outIndex end
		
		
		
		
		//2. 전화번호 인원수 대기등록
		public void pepleList() {
			System.out.println("등록페이지");
			
			System.out.print(" 전화번호 :"); int num = scan.nextInt();
			System.out.print(" 대기명단 :"); int delay = scan.nextInt();
			
			//객체화
			WaitingDto waitingDto = new WaitingDto(num, delay);
			
			boolean result = WaitingController.getinstance().pepleList(waitingDto); // 이건 나중에 저장을 만들어야함
				if(result == true) {
					
				}else if (result == false) {
					
				}
			}//peple end
		
		//3. 모든글 출력 입출력 메소드
		public void allFrint() {
			System.out.print("대기명단 출력");
			
			WaitingDto[] result = WaitingController.getinstance().allFrint(); //이건 나중에
					//결과 출력
					for(int i = 0; i <= result.length-1; i++) {
						example.dto.WaitingDto waiting = result[i];
						if (waiting != null) {
							System.out.printf("등록번호: %d 대기번호: %d 전화번호: %d",
									i,
									waiting.getDelay(),
									waiting.getNum());
							
							
						}//if end
					}//for end
			
			
			
		}//all end
	
		
}// class end
		
	
	


