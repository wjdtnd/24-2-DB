package ch11.ex_11_8;

public class Knight {
    public String name;
    public int hp=100;

    public Knight(String name) {
        this.name = name;
    }

    public void slash(){
        System.out.println(this.name + "의 일반 베기 공격");
    }
}
