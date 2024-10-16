package qiuz;

public class Monster {
    private String name;
    private int hp;
    private static int maxHp=30;

    public Monster(String s) {
        this.name=s;
        this.hp = maxHp;
    }

    public void attack(Monster enemy) {
        enemy.hp-=10;
        System.out.printf("[%s]의 공격 -> %s의 체력 : %s/%s\n",name,enemy.name,enemy.hp,maxHp);
    }

    public static void battle(Monster a, Monster b) {
        while(a.hp>0&&b.hp>0){
            Monster attacker=(Math.random()<0.5)?a:b;
            Monster defender=(attacker==a)?b:a;

            attacker.attack(defender);
        }

        if (a.hp > 0) {
            System.out.printf("%s 승리!\n", a.name);
        } else {
            System.out.printf("%s 승리!\n", b.name);
        }
    }
}
