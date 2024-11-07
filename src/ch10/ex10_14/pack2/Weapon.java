package ch10.ex10_14.pack2;

import ch10.ex10_14.pack1.Item;

public class Weapon extends Item {
    int power;

    public Weapon(String name, int price, int power){
        super(name, price);
        this.power = power;
    }

    public void print(){
        System.out.printf("[%s] 가격 : %d Gold, 공격력 : %d\n",name,price,power);//현재 클래스에 name이 없어서 super.name 안 써도 됨, 중복이 안되기 때문
    }

}

