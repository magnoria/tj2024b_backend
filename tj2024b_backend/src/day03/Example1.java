package day03; //패키지명 , 폴더명

public class Example1 { //클래스 -> 자바는 번역(컴파일)단위를 클래스 단위로 함으로써 모든 코드는 클래스 안에 존재한다

	public static void main(String[] args) {// main함수
		//번역된(.class파일)코드가 실행되기 위해서는 main함수 안에 있어야 한다.
		
		// 연산자

		//[1]대입연산자 , 왼쪽변수를 = 오른쪽변수(또는 식), 오른쪽 항 먼저 확인/계산
		int age =24; 
		
		int mathscore =10;
		int engscore =20;
		//수학점수와 영어점수값을 더해서 총점을 의미하는 변수에 대입한다.
		int totalscore= mathscore + engscore;
		
		//[2]부호연산자, +양수,-음수
		int num = 10;
		System.out.println(+num);
		System.out.println(-num);//출력을 할때 부호만 붙인거지 음수가 된것은 아님, 수정은아니다
		System.out.println(num);
		
		num = -num; //변수 선언 : 타입 변수명 = 값; // 변수호출 :변수명 // 변수값 수정 : 변수명 = 새로운값
		System.out.println(num);// 대입해서 수정해야 음수가 된다.
		
		//[3] 산술연산자, 우선순위 곱하기,나누기,나머지   그다음 +,-   수학과 같다
		System.out.println(5/3); //1.xxxxx -> 1이나옴(몫)   기본설정이 int 라서 소수점을 해석안하는것
		System.out.println(5.0/3.0); // 1.666666666666이 나옴   기본설정이 *double이라서 나누기 결과가 이렇게 나온것
		//위의 결과는 리터럴과 클래스 타입의 중요성을 알수있게함
		
		System.out.println((int)(5.0/3.0));// -> 1.66666666 -> 강제타입 -> 정수
		
		int math=90; int eng = 70; int korScore = 80;
		int total = math + eng; //총점구하기
		System.out.println(total);
		
		double avg = total/2.0; //평균구하기
		System.out.println(avg);
		
		//[1분복습]
		int korScore2 = 100;
		int mathScore2 = 90;
		int engScore2 = 80;
		int totalScore2 = korScore2+mathScore2+engScore2;
		double avgScore2 = totalScore2/3.0; //-> 이게 중요
		
		System.out.println(totalScore2);
		System.out.println(avgScore2);
				
	
	}

}
