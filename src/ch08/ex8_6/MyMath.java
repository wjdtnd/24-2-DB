package ch08.ex8_6;

public class MyMath {
    //  공유 영역에 할당 되는 메소드 : 클래스 메소드
    static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    static int min(int n1, int n2) {
        return n1 < n2 ? n1 : n2;
    }


}
