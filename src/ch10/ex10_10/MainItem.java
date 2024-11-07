package ch10.ex10_10;

public class MainItem {
    public static void main(String[] args) {
        Item item = new Item("마법지팡이",5000);

        System.out.println("아이템명 : "+item.getName());
        System.out.println("아이템가격 : "+item.getPrice()+"원");
        System.out.println("");

        Item item1 = new Item();
        System.out.println("아이템명 : "+item1.getName());
        System.out.println("아이템가격 : "+item1.getPrice()+"원");
        System.out.println("");

        Item item2 = new Item("제왕의 칼",10000,100);
        System.out.println("아이템명 : "+item2.getName());
        System.out.println("아이템가격 : "+item2.getPrice()+"원");
        System.out.println("아이템파워 : "+item2.getPower());
        System.out.println("");
    }


}
