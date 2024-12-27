package day14;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		
		
		//[1] 배열의 길이를 중간에 변경할수 없다
		String[] names = new String[3]; // String 객체 3개를 저장할수 있는 배열
			System.out.println(names); //[Ljava.lang.String;@28a418fc 배열은 주소값이 나오지만 ArrayList는 이렇게 해도 값이 나옴
		//[2] 배열에 객체(요소) 대입
	  	names[0] = "유재석";
		names[1] = "강호동";
		names[2] = "신동엽";
		
		//[3] 배열내 요소를 순회/조회
		for(int i = 0; i <= names.length-1; i++) {
			System.out.print(names[i]);
			//유재석
		}
		
		//[4] 배열내 길이 이상의 요소 대입, 길이가 3이면 인데그 0~ 2 가 존재한다.
		//names[3] = "하하"; //Index 3 out of bounds for length 3
		
		
		// [5] 베열내 중간 요소 삭제
		names[1] = null;  // 고정길이라서 삭제개념이 존재하지 않는다. 요소값을 null 비워서 사용이 가능하지만 요소 자체 삭제 불가능
		//공백으로 비울수는있으나 상자자체를 삭제할수는 없다
		
		
		//[1]ArrayList 클래스, 배열과 다르게 가변길이로 사용이 가능하다. 단점 : 라이브러리는 느리다.
			//import java.util.ArrayList; 필요
			//<제네릭타입> : 리스트에 저장할 객체의 타입
				//ArrayList<요소의타입> 변수명 = new ArrayList<>();
		ArrayList<String> nameList = new ArrayList<>();
		
		//[2] .add(요소) : 리스트에 요소 추가 함수
		nameList.add("유재석");
		nameList.add("강호동");
		nameList.add("신동엽");
		
		//[3] .size() : 리스트의 요소 총개수 반환함수 , .get(인덱스) : 리스트의 지정한 인덱스 요소값 반환함수
		for(int i = 0; i <= nameList.size()-1; i++) {
			System.out.println(nameList.get(i));
		}
		
		//[4] .ad(요소) :리스트에 요소 추가 함수
		nameList.add("하하"); // 배열과 다르게 리스트는 가변길이 이므로 자동으로 길이가 조정된다.
		//[5] .remove(인덱스) : 리스트에 지정한 인덱스 요소 삭제 함수
		nameList.remove(1);// index가 1인 '강호동' 요소 삭제 // 배열과 다르게 리스트는 가변길이 이므로 요소 삭제 가능
		
		//[6]확인
		System.out.println(nameList);
		
		// 실습 , book 클래스 객체들을 저장하는 리스트 객체 생성
		ArrayList<Book> library = new ArrayList<Book>();
			//[2] .add() 이용한 리스트객체 내 요소객체 추가
		library.add(new Book("태백산맥" , "조정래"));
		library.add(new Book("데미안" , "헤르만해세"));
		
		Book book1 = new Book("어떻게 살것인가?", " 유시민");
		library.add(book1);
		
		Book book2 = new Book("토지", "박경리");
		library.add(book2);
		
		library.add(new Book("어린왕자", "생텍주페리"));
				
			//[3] .size() : 리스트객체내 요소 총개수 반환함수,
			// .get (인덱스) : 리스트객체내 지정한 인덱스 요소 객체 반환 함수.
		for(int i = 0; i <= library.size()-1; i++) {
		Book book = library.get(i);
			System.out.println(book);
		}// for end
		
		System.out.println(library);
		
		
		
		
		
		
	}// main end

}//class end

