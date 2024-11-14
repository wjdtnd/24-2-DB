package ch11.ex_11_1_2_3;

public interface Phone {
    //인터페이스는 상수, 추상메소드, default, static 메소드 등을 사용할 수 있습니다.
    //상수는 final 과 static 키워드를 생략가능
    static final String PRODUCT_NAME="APPLE";//인터페이스에선 스태틱, 파이널 키워드 생략가능=>필드선언 시 무조건 상수이기 때문이다.

    //추상메소드는 public 과 abstract 를 생략 가능하다.
    public abstract void callPhone(String phoneNumber);//퍼블릭과 앱스트릭트는 생략가능, 순서도 바뀌어도 상관없음, 추상클래스이면 세미콜론; 으로 끝남

    void receivePhone(String phoneNumber);
}
