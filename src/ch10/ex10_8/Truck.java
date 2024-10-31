package ch10.ex10_8;

public class Truck extends Car{
    private  double payload;

    public Truck(String name, double payload) {
        super(name);//반드시 필요함
        this.payload = payload;
        System.out.printf("적재량: %.1f 톤\n",payload);
    }

    public void load(){
        System.out.printf("[%s]가 물건을 적재합니다. (최대 적재량 : %.1f 톤)\n",getName(),payload);
    }


}
