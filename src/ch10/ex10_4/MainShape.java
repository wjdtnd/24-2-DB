package ch10.ex10_4;

import java.util.ArrayList;

public class MainShape {
    public static void main(String[] args) {
        Square s = new Square();
        s.name="정사각형";
        Triangle t = new Triangle();
        t.name="삼각형";
        Circle c = new Circle();
        c.name="원";

//        Shape[] shapes = {s,t,c};

//        for(int i=0;i<shapes.length;i++){
//            System.out.printf("인덱스번호 : %d번, 도형이름 : %s\n",i,shapes[i].name);
//        }

        ArrayList<Shape> shapes =new ArrayList<Shape>();
        shapes.add(s);
        shapes.add(t);
        shapes.add(c);

        for(int i=0;i<shapes.size();i++){
            System.out.printf("인덱스번호 : %d번, 도형이름 : %s\n",i,shapes.get(i).name);
        }
    }
}
