package day03; //패키지명 , 폴더명

import java.net.MulticastSocket;

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
		double avgScore2 = totalScore2/3.0; //-> 이게 중요 3.0을 쓴 이유는 소수점까지 표현하기 위해서 3을 쓰면 int로만 되기에 소수점이 없어진다
		//그래서 double로 받음
		
		System.out.println(totalScore2);
		System.out.println(avgScore2);
		
		//[4]증감연산자 , ++ -- , 주의할점 ; (세미콜론/명령어단위) 기준으로 연산 우선순위를 정한다.
		int num2 = 10;
		int value2;
		value2 = ++num2;  //num2값이 1증가 한후에 value2 변수에 대입한다.
			System.out.println(value2);// num2 = 11, value2 =11
		value2 = num2++;  //value2변수에 기존 num2 값이 먼저 대입한후에 num2 값이 1증가한다.
			System.out.println(value2);// value2 = 11 , num2 =12
		value2 = --num2;  // num2 값이 1감소 한 후에 value2 변수에 대입한다
			System.out.println(value2);// num2 = 11 , value2 =11
		value2 = num2--;  // value2 변수에 기존 num2 값이 먼저 대입한후에 num2값이 1감소한다.
			System.out.println(value2); // value2 = 11, num2 = 10;
		
		//[예제]
		int gameScore = 150;
		int lastScore = ++gameScore; // 변수앞에 ++가 있으므로 대입(=)보다 1증가가 우선이다.
		 System.out.println(lastScore);
		 
		int lastScore2 = --gameScore; // 변수앞에 --가 있으므로 대입(=)보다 1감소가 우선이다.
			System.out.println(lastScore2); 
		
			// *사칙연산의 우선순위에 따라 *곱하기 후 +더하기 => 9
		int result1 = 3+3*2; System.out.println(result1);
			//- 연산순서
			// 1. 3*2 => 6
			// 2. 3+6 => 9
			// 3. int result1 = 9
		//*
		int x = 10;
		int y = x-- + 5 + --x;
			// - 연산순서.
			// 1. x-- +5   --> 10 + 5 => 15 [x는 +연산 후 1차감] x=9
			// 2. 15 + --x --> 15 + 8 => 23 [x는 +연산 전 1차감] x=8
			System.out.println(x); //8
			System.out.println(y); // 23
			
		//[5]비교연산자 , >초과 <미만 >=이상 <=이하 ==같다 !=다르다 , 결과는 true 또는 false
		int myAge = 27;
		boolean value = (myAge > 25); // 괄호 없어도 됨
			System.out.println(value); //true 
		
		//[6]논리 연산자 , &&논리곱 ||논리합 ! 부정  :하나ㅏ라도 참이면 참, ! 부정
		int num1 = 10;
		int i = 2;
		boolean value3 = ((num1 = num1 + 10) < 10) && (( i = i+2) < 10);
							// ---여기에서 false 이므로,  ---뒤에 조건은 볼 필요가 없으므로 코드 실행이되지 않는다.
		System.out.println(value3); //false
		System.out.println(num1);//20
		System.out.println(i); //4---2
		
		value3 = ((num1 = num1 + 10) > 10) || ((i = i+2) < 10);
				//여기에서 true이므로 , -- 뒤에 조건은 볼 필요없으므로 코드는 실행되지 않는다.
			System.out.println(value3); //true
			System.out.println(num1); // 30
			System.out.println(i); // 2
		
		//[7] 복합대입연산자 , += =+ *= /= %=
		// p.81 1분복습
		num1 = num1 + 5;
		num1 += 5; //위를 간략화
				
				
				
		//[8] 조건연산자 , 조건식 ? 참결과 : 거짓결과
		int num3 = 5 > 3 ? 10 : 20; // 만일 5가 3보다 크면 10대입하고 아니면 20 대입한다.
		
		int fatherAge = 45;
		int matherAge = 47;
		char ch;
		ch = (fatherAge > matherAge) ? 'T': 'F';
			System.out.println(ch); //F
			//P.82 1분복습
			//1. isEven
			//2.짝수구하기 num %2 ==0
		
		// p. 87페이지 연산자 우선순위(참고)
	
	}

}
