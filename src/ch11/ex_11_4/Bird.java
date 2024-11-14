package ch11.ex_11_4;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("새가 멋지게 날아갑니다.");
    }
}
