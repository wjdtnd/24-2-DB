package qiuz;

public class MainAccountTest {
    public static void main(String[] args) {
        AccountTest a=new AccountTest("123-45",10000);
        AccountTest b=new AccountTest("567-89",10000);
        System.out.printf("a계좌번호 : %s, a잔액 : %d\n",a.getNum(),a.getBalance());
        System.out.printf("b계좌번호 : %s, b잔액 : %d\n",b.getNum(),b.getBalance());

        while(a.transfer(b,3000)){
            ;
        }
        System.out.println(a.toString());
        System.out.println(b.toString());

    }

}