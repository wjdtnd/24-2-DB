package ch11.ex_11_8;

public class MagicKnight extends Knight implements Magician{
    public int mp=100;//마력

    public MagicKnight(String name) {
        super(name);
    }

    @Override
    public void magicShield() {
        System.out.printf("[%s](이)가 모든 공격을 보호막으로 방어합니다.\n",name);
    }

    @Override
    public void teleport() {
        System.out.printf("[%s](이)가 순간이동을 합니다.\n",name);
    }

    @Override
    public void slash() {
        System.out.printf("[%s]의 마력이 깃든 베기 공격~~~ 을 합니다.\n",name);
    }
}
