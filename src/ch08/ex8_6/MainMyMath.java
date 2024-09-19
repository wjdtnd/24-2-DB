package ch08.ex8_6;


import java.util.Scanner;

public class MainMyMath {
    public static void main(String[] args) {
//        int n1=10
//        int n2=20;
//        System.out.printf("%d과 %d 중에 더 큰 값 : %d\n",n1,n2,MyMath.max(n1,n2));
//        System.out.printf("%d과 %d 중에 더 작은 값 : %d\n",n1,n2,MyMath.min(n1,n2));



        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 정수값 : ");
        int n1 = scanner.nextInt();
        System.out.println("두번째 정수값 : ");
        int n2 = scanner.nextInt();
        scanner.close();

        System.out.printf("%d 과/와 %d 중에 더 큰 값 : %d\n",n1,n2,MyMath.max(n1,n2));
        System.out.printf("%d 과/와 %d 중에 더 작은 값 : %d\n",n1,n2,MyMath.min(n1,n2));
    }
}
