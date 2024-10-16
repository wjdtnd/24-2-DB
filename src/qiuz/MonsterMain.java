package qiuz;

public class MonsterMain {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton=new Monster("해골");

        Monster.battle(orc,skeleton);
    }
}
