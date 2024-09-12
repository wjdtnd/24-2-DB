package ch08.ex8_2;

public class Drink {
    private String name;
    private int price;

    // 기본 생성자
    public Drink() {
        this.name = "Unknown";
        this.price = 0;
    }

    // 매개변수 있는 생성자
    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // getter와 setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 객체 정보를 출력하기 위한 toString 메서드 재정의
    @Override
    public String toString() {
        return "Drink{name='" + name + "', price=" + price + "}";
    }
}
