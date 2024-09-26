package ch09.ex9_3;
import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        //정수, 실수, 논리값, 특정 개수 등 설정 가능
        Random random = new Random();

        System.out.printf("임의의 정수 : %d\n",random.nextInt());
        System.out.printf("0~9 사이의 임의 정수 : %d\n",random.nextInt(10));
        System.out.printf("0~10 사이의 임의 정수 : %d\n",random.nextInt(10)+1);
        System.out.printf("임의의 실수 : %f\n",random.nextDouble(100));
        System.out.printf("임의의 참/거짓 : %b\n",random.nextBoolean());

    }
}
