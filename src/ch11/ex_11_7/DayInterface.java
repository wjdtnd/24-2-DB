package ch11.ex_11_7;

//상수 사용예제
public interface DayInterface {
    //final 은 처음이자 마지막 값, 수정 변경 불가, 초기화 필수, 처음 초기화 한 후에는 다른 값으로 변경할 수 없다.
    //static 은 인터페이스명을 .앞에 붙여서 상수를 사용할 수 있다.
    String MONDAY = "월요일";//인터페이스 내에서는 상수만 사용됨, public static final 키워드 생략가능, 상수역할 가능
    public static final String TUESDAY = "화요일";
}
