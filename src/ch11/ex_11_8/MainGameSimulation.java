package ch11.ex_11_8;

public class MainGameSimulation {
    public static void main(String[] args) {
        Knight atomic = new Knight("아토믹"); //휴먼
        Knight uther = new HolyKnight("우서"); //신성한 능력을 가진
        Knight genji = new MagicKnight("겐지"); //마법 능력을 가진

        //위 3개의 공통점은 부모클래스의 참조변수가 선언되어있음

        atomic.slash();
        uther.slash();
        genji.slash();

        Healer healer1 = (HolyKnight)uther;
        Healer healer2 = new HolyKnight("우서 동생");

//        healer1.slash();//Healer 라는 인터페이스의 참조변수이므로, Healer 인터페이스를 통해 구현된 메소드만 호출할 수 있다. 인터페이스가 가지고 있는 메서드만 사용가능

        Magician magician1 = (MagicKnight)genji;
        magician1.magicShield();
        magician1.teleport();

        MagicKnight magicKnight=new MagicKnight("겐지동생");
        magicKnight.magicShield();
        magicKnight.teleport();
        magicKnight.teleport();
    }
}
