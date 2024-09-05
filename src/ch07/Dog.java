package ch07;

public class Dog {
    private String name;
    private String breeds;
    private int age;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public void wag(){
        System.out.println(name+"(이)가 살랑살랑 꼬리를 친다.");
    }

    public void bark(){
        System.out.println("멍멍!");
    }

    public void bark(int times,String sounds){
        System.out.printf("%s(이)가 %d번 %s 짖는다.\n",name,times,sounds);
    }



}
