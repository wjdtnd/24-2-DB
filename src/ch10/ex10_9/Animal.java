package ch10.ex10_9;

//추상클래스
//자식클래스들을 표준화(특정 기능을 반드시 갖도록) 시키기 위해 만든다.
abstract public class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String name;

    // 앱스트럭트 붙어 있으면 추상 메소드임
    public abstract void eat(String food);

    public abstract void cry(String sound);

    public void sleep(int hours){
        System.out.println(getName() + "(이)/가 " +hours + "시간 동안 잔다.");
    }

}
