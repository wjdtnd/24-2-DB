package ch11.ex11_5;

public class Bicycle implements Vehicle {
    //추상메소드 필수로 오버라이딩 해야함 {}들어간거
    @Override
    public void horn() {
        System.out.println("따르릉 따르릉");
    }
    // 인터페이스에 정의된 static 메소드 stop()은 오버라이딩 할 수 없다. // {}정의됨을 의미, {}X선언됨을 의미
    // 인터페이스에 ststic 오버라이딩할 수는 없지만 현재 클래스에서 정의는 할 수 있다.
    // 사용할 때는 Bicycle.stop()을 해서 구분해서 쓰십시오.
    static public void stop(String place){
        System.out.println( place + "에 자전거가 멈춘다.");
    }

}
