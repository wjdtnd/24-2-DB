package ch08.ex8_8;

public class Account {
    private int balance;
    private String name;
    private int pwd;

    public Account(int balance, String name, int pwd) {
        name = "";
        pwd = 0;
        balance = 0;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPwd(){
        return pwd;
    }

    public void setPwd(int pwd){
        this.pwd = pwd;
    }

    //입금하는 메소드 deposit
    public void deposit(int money){
        balance += money;//balance=balance+money
    }

    //출금하는 메소드 withDraw
    public void withdraw(int money){
        balance -= money;//balance=balance-money
    }


}
