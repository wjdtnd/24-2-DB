package ch12.ex12_7;

import ch12.ex12_6.MyAgeException;

public class TrowsTest {
    public void test1() throws MyAgeException {
        System.out.println("* test1() 호출됨");
        test2();
    }

    public void test2() throws MyAgeException {
        System.out.println("* test2() 호출됨");
        throw new MyAgeException("나이를 잘못입력했어요.");
    }
}
