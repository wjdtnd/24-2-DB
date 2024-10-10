package ch10.ex10_1;

public class Knight extends Novice{
    int stamina;

    void slash(){
        System.out.printf("%s(HP: %d, Stamina: %d)의 칼로 베기 ~/////////~~~~~\n",name,hp,stamina);
    }
}
