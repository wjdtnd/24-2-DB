package ch10.ex10_9;

public class Dog extends Animal{
    public void eat(String food){
        System.out.println(getName()+"(이)/가 "+food+"(을)/를 먹는다.");
    }
    public void cry(String sound){
        System.out.println(getName()+"(이)/가 "+sound+"하고 소리를 낸다.");
    }
    public void wag(){
        System.out.println(getName() + "(이)/가 꼬리를 살랑살랑 흔든다.");
    }
}
