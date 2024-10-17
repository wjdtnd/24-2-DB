package ch10.ex10_1;

public class RPGGameTestMain {
    public static void main(String[] args) {
        Wizard w1=new Wizard();
        w1.name="간달프"; //노비스클래스에 이름
        w1.hp=100;
        w1.mp=80;
        w1.punch();
        w1.fireball();

        Knight k1=new Knight();
        k1.name="아라곤"; //노비스클래스에 이름
        k1.hp=170;
        k1.stamina=100;
        k1.punch();
        k1.slash();
    }
}

