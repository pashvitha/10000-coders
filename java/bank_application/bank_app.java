

import java.util.Scanner;

public class bank_app {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.print("Enter phone number: ");
        long phone = sc.nextLong();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // Create object
        BLC obj = new BLC(name, address, phone, balance);

        int option;

        do {
            System.out.println("\n**** MENU ****");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");

            System.out.print("Enter option: ");
            option = sc.nextInt();

            switch(option) {

                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double w = sc.nextDouble();
                    obj.withdraw(w);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double d = sc.nextDouble();
                    obj.deposit(d);
                    break;

                case 3:
                    // Using getter here
                    // System.out.println("Balance is: " + obj.getBalance()); 
                    System.out.println("balance"+obj.getBalance());
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while(option != 4);
    }
}
class BLC{
    private String customer_name;
    private String customer_Address;
    private long phn_num;
    private double balance;

    BLC(String customer_name,String customer_address,long phn_num,double balance) {
        this.customer_name=customer_name;
        this.customer_Address=customer_address;
        this.phn_num=phn_num;
        this.balance=balance;
        System.out.println("Account created sucessfully"); 

    } 

    public String getCustomer_name(){
        return customer_name;
    } 

    public String getCustomer_Address(){
        return customer_Address;
    }
    public long getPhn_num(){
        return phn_num;


    }
    public double getBalance(){
        return balance;
    }
    
    public void setCustomer_name(String customer_name){
        this.customer_name=customer_name;
    } 

    public void setCustomer_Address(String customer_address){
        this.customer_Address=customer_address;
    }  

    public void setPhn_num(long phn_num){
        this.phn_num=phn_num;
    } 

    public void setBalance(double balance){
        this.balance=balance;

    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("enter valid amount");
        }
        else{
            balance+=amount;
            System.out.println("available balance"+balance);
        }
    } 

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid withdrawal amount");
        }
        else if(amount > balance){
            System.out.println("Insufficient funds");
        }
        else{
            balance-=amount;
            System.out.println("Available balance "+balance);
        }
    }

    public void showbalance(){
        System.out.println(balance);
    }

    
    
}
