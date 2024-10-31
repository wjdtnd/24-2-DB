package ch10.ex10_5;

public class MainArcher {
    public static void main(String[] args) {
        Archer archer1 = new Archer();
        MasterArcher ma = new MasterArcher();
        Archer archer2 = new MasterArcher();
        Archer archer3 = (Archer) new MasterArcher();

        archer1.shoot();//일반 궁수 Archer의 shoot
        ma.shoot();//숙련된 궁수 MasterArcher의 shoot
        archer2.shoot();//숙련된 궁수 MasterArcher의 shoot
        archer3.shoot();//숙련된 궁수 MasterArcher의 shoot, 캐스팅을 해도 masterArcher가 실행이 됨, 오버라이딩 된 메서드가 있으면 오버라이딩 된거 실행됨



    }
}
