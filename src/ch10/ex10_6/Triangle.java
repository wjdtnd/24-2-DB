package ch10.ex10_6;

public class Triangle extends Shape{
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int width;
    private int height;

    @Override
    double area() {
        double result = (width * height)/2.0; //int 끼리 계산하면 int만 나옴, 하지만 더블형에 저장하고 싶으니 실수로 나누기
        return result;
    }
}
