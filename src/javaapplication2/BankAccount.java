package javaapplication2;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;
    
    public BankAccount(){
        System.out.println("empty");
    }
    
    public BankAccount(String accountNumber, double balance, String customerName,String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public String getCustomerName(){
        return this.customerName;
    }
    
    public void setEmail (String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setPhoneNumber (int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public int getPhone(){
        return this.phoneNumber;
    }
    
    
    public void depositFund(double addFunds){
        balance += addFunds;
        System.out.println("The balance is = " + balance);
    }
    
    public void withdrawFunds(double takeFunds){
        if(balance < takeFunds){
         System.out.println("funds not sufficient");
        }else{
            balance -= takeFunds;
            System.out.println("You are left with " + balance);
        }
    }
    
    
    
    
    
}
