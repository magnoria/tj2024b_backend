package day02; //폴더명 패키지명

public class Example2 { // 클래스 시작

	public static void main(String[] args) {
				
		//1. 자동형(자료/타입)변환, 묵시적 (자료/타입)형 변환
			// - 1. 메모리 크기가 작은 것 부터 큰순으로 변환
			// - 2. 데이터의 손실이 없다.
			// = 3. 연산(계산) 중에 큰 값으로 변환된다.(메모리손실 방지)
		// byte -> short , char -> int -> long -> float -> double
		byte byteValue =10;					// byre타입으로 'byteValue' 변수에 10대입
		short shortValue = byteValue;		// short타입 'shortValue' 변수에 byte 10을 대입
		int intValue = shortValue;			// int타입 'intValue' 변수에 short 10을 대입
		long longValue = intValue;			// 변수값을 가져와서 l을 붙일 필요가 없다 , 
		float floatValue = longValue;		//
		double doubleValue = floatValue;	// 
		System.out.println("double value:"+ doubleValue); //bute에서 double 까지 자동형변환
		// + 연산중에 묵시적 형변환 , 연산시 피연산자중에 더 큰 타입으로 결과를 반환한다.
				//byte+ byte => int    , 예외)int 이하 byte와  short 연산결과는 무조건 int로 반환된다.
				// byte + short => int
				//int + int => int
				// int + long => long
				//int + float => float
				//float + double => double
		byte b1 =10; byte b2 =20; short s1 =30; int i1 =40; float f1 =3.14f; double d1 =41.25;
		int result1 = b1+b2;
		int result2 = b1+s1;
		float result3 =i1+f1;
		double reuslt4 =f1+d1;
		
		//byte result = b1 + b2; 오류남 int여야함
		//short result2 = b1+b2; 오류남 int여야함
		//int result3 = i1+ f1;
		
		//2. 강제(자료/타입)형 변환, 명시적 (자료/타입)형 변환, 캐스팅
			// - 1. 메모리 크기가 큰것 부터 작은 순으로 변환
			// - 2. 데이터의 (허용범위 외)손실이 있을 수도 있다.
			// - 3. (변환할타입명)변수명 <-  이걸 캐스팅이라고 함 , (변환할타입명)리터럴값   도 가능
			// - douuble -> float -> long -> int ->short, char -> byte   (char는 바이트로 불가) 
		double value1 =3.14;
		
		float value2 = (float)value1; //강제 형변환
		//float value2 = value1; 그냥은 안됨
		long value3 = (long)value2;
		int value4 = (int)value3;
		short value5 = (short)value4;
		byte value6 = (byte)value5;
		System.out.println("byte value:"+ value6 ); //3.14   ---> 3 , .14 (손실) 정수가 소수점을 표현할수 없어서
		
		// +++ 자바특징중에 다형성(다양한 형식/ 타입을 가지는 성질)은 형변환으로 부터 표현할수 있다.
		
		char ch1 ='A';
		System.out.println((int)ch1);
		
		int int1 =ch1;//이것도 가능
		System.out.println(ch1);
		
		
		int ch2=67;
		System.out.println((char)ch2);
		
		char test = (char)ch2;
		System.out.println(test);
		
		//+ 연산중에 강제 타입변환
		int result5 =(int)381.01+3; //3.14+3은 불가
		
		//문제풀이
		
		
		//4.
		int 정수1 =10;
		double 정수2 =2.0;
		double 결과1 =정수1 + 정수2;// int + double -> double로 변환해야함
		
		//5.
		char 문자1 ='글'; // 문자열"", 문자''
		int 문자정수1 = 문자1;
		System.out.println("글 정수:" + 문자정수1); //44544
		System.out.println("글 정수:" + (char)(문자정수1+1)); //강제 변환시 식에다가 ()넣어야함
		//+ JAVA 정수로 표현하면 , 74 65 86 65
		System.out.println((char)74+"" +(char)65+"" + (char)86+"" + (char)65); //""넣어줘야 문자로 변함 아님 다 더해짐
		
		char 문자2 ='A'; //char 2바이트, 65
		char 문자3 ='B'; //short 2바이트
		System.out.println( 문자2+문자3); //컴퓨터는 문자를 표현하기 위해서 정수를 사용한다. 그렇기에 char 자체도 문자열이 아니라 숫자로 표현된다 문자열 리터럴을 저장할뿐
		
		
	}// main end

}// 클래스 끝
