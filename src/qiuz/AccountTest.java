package qiuz;

import ch08.ex8_8.Account;

public class AccountTest {
    private String num;
    private int balance;

    public AccountTest(String num, int balance) {
       this.num=num;
       this.balance=balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getNum() {
        return num;
    }

    public int outMoney(int balance) {
      return this.balance - balance;
    };

    public int inputMoney(int balance) {
        return this.balance+balance;
    }

    public boolean transfer(Account account,int amount){
        if(balance<amount){
            System.out.println("잔액이 부족하여 이체 불가능!!!");
            return false;
        }
        balance-=amount;
        return true;
    };
}
