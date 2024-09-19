package ch08.ex8_8;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        //Account account = new Account();
        Scanner scanner1= new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);

        System.out.println("계좌의 별칭을 입력해주세요 . : ");
        String accountName = scanner1.nextLine();

        System.out.println("설정하실 비밀번호를 입력해주세요.(숫자 5자리) : ");
        int accountPwd=scanner2.nextInt();
        System.out.println("입금하실 금액을 입력해주세요. : ");
        int balance=scanner2.nextInt();

        //처음 통장 개설 했을때
        Account account=new Account(account.getName(),account.getPwd(),balance);
        System.out.println(account);

        //통장에서 10000원 출금
        System.out.println("출금하실 금액을 입력해주세요. : ");
        int deposit=scanner2.nextInt();

        account.deposit(deposit);

        //통장에서 2600000원 입금
        System.out.println("출금하실 금액을 입력해주세요. : ");
        int withDraw=scanner2.nextInt();

        account.withdraw(withDraw);

        System.out.printf("통장 잔액은 %d원 입니다.\n",account.getBalance());

        scanner1.close();
        scanner2.close();
    }
}
