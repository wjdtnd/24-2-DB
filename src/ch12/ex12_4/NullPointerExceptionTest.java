package ch12.ex12_4;

import java.util.ArrayList;

public class NullPointerExceptionTest {
//  참조 변수를 선언만하고 객체 참조 값을 대입하지 않은 상태로 사용하면 NullPointer Exception 이 발생한다.
    ArrayList<String> listNames = new ArrayList<>();

    public void addName(String name){
        listNames.add(name);
    }

    public void printAllName(){
        for(String name:listNames){
            System.out.println(name);
        }
    }

}
