package ch10.ex10_6;

public class Square extends Shape{
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;//this는 지역변수랑 전역 변수 구분하기 위해서, this는 필드 값임
    }

    @Override
    double area() {
        double result = Math.pow(width,2);
        return result;
    }

    ;
}
