package ch11.ex_11_5_6;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Bicycle();

        vehicle.horn();
        vehicle.move("보광동","이태원역");

        System.out.println("****************************");

        Bicycle bicycle = new Bicycle();
        bicycle.horn();
        bicycle.move("한강진역","이태원역");//Vehicle 의 default 메소드가 호출됨
        Bicycle.stop("맥심플랜트");

        System.out.println("****************************");

        Vehicle vehicle1 = new Train();
        vehicle1.horn();
        vehicle1.move("서울","남원");//오버라이딩된거 호출됨, Train 의 오버라이딩 된 메소드 호출

        System.out.println("****************************");

        Vehicle.stop("대전역");

        System.out.println("****************************");
    }
}
