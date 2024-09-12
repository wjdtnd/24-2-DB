package ch08.ex8_4;

public class MainAvenger {
    public static void main(String[] args) {
        Avenger thor = new Avenger(150,"토르");
        Avenger thanos=new Avenger(160,"타노스");

        thor.punch(thanos);
    }
}
