package ch10.ex10_11;

import ch10.ex10_10.Item;

public class Weapon extends Item2 {
    String name="기본 Weapon";
    int power;

    Weapon(){
        //super(); 생략해도 기본으로 들어감
        power=-1;
    }

    Weapon(String name,int price, int power){
        super(name,price);
        this.power=power;
    }

    void print(){
        System.out.printf("[%s] 가격 : %d Gold, 공격력 : %d\n",super.name,price,power);
    }//super는 자식이랑 부모 구분하기 위해서 사용

}
