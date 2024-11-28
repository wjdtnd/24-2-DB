package ch12.ex12_9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("손예진","111-22-3333",1000000);
        BankAccount b2 = new BankAccount("현빈","555-66-8888",10000000);


        try {
            File file = new File("result_account.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(b1.toString()+"\n");
            fw.write(b2.toString()+"\n");
            //프로젝트 안에 파일이 저장됨.
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
