package ch10.ex10_9;

public class Main {
    public static void main(String[] args) {
        //추상클래스는 new 연산자로 객체 생성이 불가능하다. 하지만 익명 클래스로 다시 오버라이딩 하여 하는 건 된다 새롭게 생성되는것.
//        Animal animal=new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("말티즈");
        dog.eat("사료");//추상
        dog.cry("멍멍");//추상
        dog.sleep(5);//추상
        dog.wag();//일반

        cat.setName("페르시안");
        cat.eat("츄르");
        cat.cry("냐옹냐옹");
        cat.sleep(4);
        cat.grooming();

        //업케스팅을 하면 부모 클래스의 모든 멤버 사용가능
        //but 자식클래스의 멤버는 부모클래스의 메소드르 오버라이딩된 메소드만 사용 가능
        Animal animal = new Dog();

    }
}
