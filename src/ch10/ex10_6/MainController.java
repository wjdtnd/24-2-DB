package ch10.ex10_6;

import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(7);
        square.name="정사각형";

        Triangle triangle = new Triangle();
        triangle.setWidth(15);
        triangle.setHeight(9);
        triangle.name="삼각형";

        Circle circle = new Circle();
        circle.setRadius(15);
        circle.name="원";

//        ArrayList<Shape> arrList = new ArrayList<Shape>();
//        arrList.add(square);
//        arrList.add(triangle);
//        arrList.add(circle);// 어레이리스트 사용

        Shape [] arr = {square,triangle,circle}; //배열로 저장해서 사용

        viewShape(arr);
    }

    public static void viewShape(Shape[] arrList) {
        for(Shape shape : arrList) {
            System.out.printf("%s의 면적은 %.2f ㎠ 입니다.\n",shape.name,shape.area());
        }

    }
}
