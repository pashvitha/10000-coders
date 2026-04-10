
import java.util.Scanner;

public class atm_balance {
    public static void atm_bal_display(String name,long balance){ 
        System.out.println("----- ATM BALANCE -----");
        System.out.println("Account Holder : " + name);
        System.out.println("Available Balance : ₹" + balance);
        System.out.println("------------------------");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=sc.nextLine(); 
        System.out.print("Enter Balance: ");
        long balance=sc.nextLong();
        atm_bal_display(name, balance);
    }
}
