package ch08.ex8_5;

public class Student {
    //  공유 영역(static) 할당:클래스필드, 클래스변수라고 부름
    static int count;

    //  힙 영역(non-static) 영역 할당 : 인스턴스변수
    int id;
    String name;

    Student(int id, String name){
        count++;
        this.id = id;
        this.name = name;
    }


}
