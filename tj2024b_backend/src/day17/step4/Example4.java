package day17.step4;

public class Example4 {

	public static void main(String[] args) {
		
		//[1] customer 인스턴스 생성
		Customer customer = new Customer();
		// 첫글자 대문자 : 주로 클래스명/인터페이스명
		// 하위타입이 생성될때 상위타입도 같이 참조한다.
		//Customer ---> Buy/Sell
		

		//[2] customer 인스턴스가 Buy타입 형변환
		Buy buyer = customer;
		buyer.buy(); //구매하기
		
		//[3] customer 인스턴스가 Sell타입 형변환
		Sell seller = customer; // (업)캐스팅
		seller.sell(); //판매하기
		
		//[4] 변수명 instanceof 타입 : 변수가 참조하는 인스턴스의 타입 조회
		if (seller instanceof Customer) {//true
			Customer customer2 = (Customer)seller;// (다운)캐스팅
			customer2.sell();
			customer2.buy();
			
		}
	} //main end
}//class end
