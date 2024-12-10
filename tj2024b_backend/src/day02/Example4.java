package day02;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		 //[콘솔입력]
		// JS : prompt , document.querySelector().value
		// JAVA : Scanner
			//- Scanner 클래스 입력시 코드파일 상단에 import java.utill.Scanner; 가 생김 -> 자동완성기능을 사용해야 Scanner class를 불러오고 완성기능을 안쓰면 못불러와서
		//오류가 뜰때가 있음
		
			// -> import란 다른 패키지/폴더의 클래스를 가져온다는 코드 , 예외 ] java.lang 패키지 (기본클래스 모임) 
		
		//1. 입력 객체 만들기, 객체 생성 방법 : new 클래스명 (), java의 클래스명은 첫글자를 대문자로 시작한다
		//new Scanner( ); //Scanner 클래스, Scanner 클래스 이용한 Scanner 객체 생성
		//new Scanner(System.in); // System.in 입력객체, Scanner 객체 생성시 입력객체를 인수로 전달한다.
		
			//Scanner scanner;// Scanner 타입으로 'scan' 변수 선언 // 기본타입(8가지)외 참조(클래스)타입
			//scanner =new Scanner(System.in); //'scan'변수에 Scanner 객체(주고)대입 했다.
		
		Scanner scan = new Scanner(System.in);    // 입력 객체 생성시 주의할점 : class 파일의 1개만 존재해도 여러번 입력받을 수 있다.
		//2. 입력 객체로 콘솔에서 키보드로부터 입력받은 데이터 가져오기 함수를 제공한다
			// - 객체란? 고유 속성/데이터 , 이벤트/함수를 가지는 실체물
		   // 입력객체.next000(); 엔터 기준으로 하나의 (text)입력 마침 처리한다. 
		
		//[1] 문자열 입력받기 , 문자열 입력받기 함수 , 변수명.next() 키보드로부터 입력받은 데이터를 String타입으로 반환 함수
		System.out.print("[1] .next()문자열 입력: "); //안내문구 출력
		String str1 = scan.next(); // 콘솔에서 키보드로부터 입력받은 데이터를 String 타입으로 반환
		System.out.println("[1] .next()입력결과:"+ str1);
		
		//[2]변수명nextLine() , 키보드로 부터 입력받은 데이터를 string 타입으로 반환 함수. 띄어쓰기 가능
			// * 주의할점 : nextLine은 다른 next()코드와 사용시 앞전 next의 개행(엔터)를 포함하므로 하나로 인식한다.
			// - 해결방안 : 의미없는 scan.nextLine()사용하므로 실사용할  nextLine()구분하기 (위에 엔터까지 인식할 nextLine을 하나 만들고 아래에 실사용할것을 만드는것)
			// 또는 객체 다시 만들기 
		System.out.print(".nextLine()문자열입력:");
		scan.nextLine();// 의미없는 단순 nextLine() 위에서 엔터를 치면 이것도 마쳐진다고 인식해버리기 때문에 의미없는걸 만든다.
		String str2 = scan.nextLine();
		System.out.println("[2].nextLine:"+str2);
		
		//[3] 변수명.nextInt(), 키보드로부터 입력받은 데이터를 int타입으로 반환함수, 허용범위 넘어가면 오류 발생
		System.out.println("[3]입력:");
		int value1 =scan.nextInt();
		System.out.println("[3]nextInt결과 :" +value1);
		
		//[4] 변수명.nextByte(); ~~byte 타입으로 반환 함수
		byte value2 = scan.nextByte();
		System.out.println("[4]nextByte()결과"+ value2);
		
		//[5] 변수명.nextShort() ,short타입으로 반환 함수
		short value3 =scan.nextShort();
		System.out.println("[5]nextShort결과"+value3);
		
		
		//[6] 변수명.nextLong() , ~~long 타입으로 반환 함수
		long value4 =scan.nextLong();
		System.out.println("[6] can.nextLong 결과 "+value4);
		
		//[7] 변수명.nextFloat() , ~~float타입으로 반환 함수
		float value5 =scan.nextFloat();
		System.out.println("[7]nextFloat 결과 :" +value5);
		
		//[8] 변수명.nextDouble(), ~~double 타입으로 반환함수
		double value6 =scan.nextDouble();
		System.out.println("[8]. nextDouble 결과"+value6);
		
		//[9] 변수명.nextboolean(); ~~boolean 타입으로 반환 함수.
		boolean value7 =scan.nextBoolean();
		System.out.println("[9] nextBoolean 결과"+value7);
		
		//+오류 : 지정한 함수의 반환타입과 입력한 데이터 허용범위 벗어나면 inputMIsmatchException발생
		
		//inputMIsmatchException : 입력함수 반환타입과 키보드로부터 입력한 데이터가 허용범위 벗어날때 발생
			//- 해결방법 : 코드에 입력한 입력함수 반환타입에 맞게 키보드로부터 데이터를 타입에 맞게 입력한다.
		
	
		
	}

}
