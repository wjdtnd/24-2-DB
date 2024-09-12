package ch08.ex8_2;

public class MainDrink {
    public static void main(String[] args) {
        Drink d1 = new Drink(); // 기본 생성자 호출
        Drink d2 = new Drink("박카스", 800); // 매개변수 있는 생성자 호출

        System.out.println(d1);
        System.out.println(d2);
    }
}
