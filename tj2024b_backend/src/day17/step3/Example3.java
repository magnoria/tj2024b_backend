package day17.step3;

class Car { //클래스 하나
    Tire tire;
    public void run(){  this.tire.roll();    }
}

interface Tire { // 공유 interface
    void roll();
}

class HankookTire implements Tire { //연결된 class han
    @Override
    public void roll(){
        System.out.println("한국 타이어가 회전합니다.");
    }
}
class KumhoTire implements Tire { // 연결된 class kum
    @Override
    public void roll(){
        System.out.println("금호 타이어가 회전합니다.");
    }
}


public class Example3 {
    public static void main(String[] args) {

        Car myCar = new Car();
        // myCar.run();
        Car yourCar = new Car();
        //yourCar.tire = new Tire(); // 실행이 안되는 이유 타이어는 인터페이스이므로 구현할 클래스가 있어야해서 객체가 생성이 안됬다.
        //yourCar.run();     interface는 실행기능이 없으므로(구현부가 없으므로) 실행불가

        //myCar.tire = new Tire();
        //myCar.run();		interface는 실행기능이 없으므로 실행불가

        myCar.tire = new HankookTire();
        myCar.run();// 한국타이어

        myCar.tire = new KumhoTire();
        myCar.run();    //금호타이어
        //yourCar.run(); // mycar에만 tire를 넣었고 your카는 카만 만들었을뿐 tire를 넣지 않았다.

        System.out.println( myCar.tire instanceof KumhoTire);//금호타이어
        if( myCar.tire instanceof Tire){ // true
            myCar.tire = new HankookTire();
        }
        myCar.run();
    }
}
	

