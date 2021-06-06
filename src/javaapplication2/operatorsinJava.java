package javaapplication2;

import java.util.HashSet;
import java.util.Set;

public class operatorsinJava {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        
        BankAccount cai = new BankAccount();
        cai.setAccountNumber("cai123");
        System.out.println("Account is " + cai.getAccountNumber());
        cai.depositFund(1000);
        System.out.println("Balance is " + cai.getBalance());
        cai.withdrawFunds(1000);
        System.out.println("Balance is " + cai.getBalance());

        
        
    }
    
}
