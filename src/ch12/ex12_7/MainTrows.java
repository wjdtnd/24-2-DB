package ch12.ex12_7;

import ch12.ex12_6.MyAgeException;

public class MainTrows {
    public static void main(String[] args) {
        TrowsTest tt = new TrowsTest();

        try {
            tt.test1();
        } catch (MyAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
