package ch08.ex8_4;

public class Avenger {
    private String name;
    private int horsePower;

    public Avenger(int horsePower, String name) {
        this.horsePower = horsePower;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void punch(Avenger enemy) {
        System.out.printf("<%s>의 펀치가 날아갔다.\n",this.getName());
        enemy.setHorsePower(enemy.getHorsePower()-10);
        System.out.printf("=> <%s>의 체력이 %d로 감소했다.\n",enemy.getName(),enemy.getHorsePower());

    }
}
