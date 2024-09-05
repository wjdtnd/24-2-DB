package ch07.ex11;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();

        c1.setHeight(5);
        c1.setRadius(4);

        System.out.printf("원기둥의 부피 : %.2f\n 원기둥의 겉넓이 : %.2f\n",c1.getVolume(),c1.getArea());

    }
}
