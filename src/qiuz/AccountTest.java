package qiuz;

import ch08.ex8_8.Account;

public class AccountTest {
    private String num;
    private int balance;

    public AccountTest(String num, int balance) {
       this.num=num;
       this.balance=balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getNum() {
        return num;
    }

    public boolean transfer(AccountTest account,int amount) {
        if (balance >= amount) {
            account.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "AccountTest{" +
                "num='" + num + '\'' +
                ", balance=" + balance +
                '}';
    }
}
