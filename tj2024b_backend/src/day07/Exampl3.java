package day07;

import java.util.Scanner;

public class Exampl3 {
	
	public static void main(String[] args) {
				Login login1 = new Login();
				Login login2 = new Login();
				Login login3 = new Login();
			
		
		while (true) {
			
				System.out.println("1.회원가입 2.로그인");
				
				Scanner scan = new Scanner(System.in);
				int choose = scan.nextInt();
			
			if (choose == 1) {
				System.out.println("> 아이디 :"); String loid = scan.next();
				System.out.println("> 비밀번호 :"); int logSic = scan.nextInt();
				System.out.println("> 닉네임 :"); String logNic = scan.next();
				if (login1.id == null) {
					login1.id = loid; login1.sicrit = logSic; login1.nic = logNic;
					
				}else if (login2.id == null) {
					login2.id = loid; login2.sicrit = logSic; login2.nic = logNic;
					
				}else if (login3.id == null) {
					login3.id = loid; login3.sicrit = logSic; login3.nic = logNic;
					
				}
				
				
				
				
				
			}else if (choose == 2) {
				System.out.println("> 아이디:"); String loid = scan.next();
				System.out.println("> 비밀번호:"); int logSic = scan.nextInt();
				
				
				if (login1.id.equals(loid) && login1.sicrit == logSic) {
					System.out.println("로그인 성공하셨습니다.");
					
				}else if (login2.id.equals(loid) && login2.sicrit == logSic) {
					System.out.println("로그인 성공하셨습니다");
					
				}else if (login3.id.equals(loid) && login3.sicrit == logSic) {
					System.out.println("로그인 성공하셨습니다");
				}else {
					System.out.println("로그인 실패하셨습니다.");
				}
				
			}// if end
			
			
			
			
			
			
			
			
			
			
		}//while end
			
		
		
		
	}//main end

}
