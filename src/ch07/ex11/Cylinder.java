package ch07.ex11;

public class Cylinder {
    private int radius;
    private double height;

    double getVolume() {
        return Math.PI * radius * radius * height;
    }

    double getArea() {
        return 2 * Math.PI * radius  * height +(2*Math.PI*radius*radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
