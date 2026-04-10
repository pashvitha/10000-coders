
import java.util.Scanner;

public class cab_fare_cal {
    public static void fun(String name,int distance){
        int pricePerKm = 100;
        int total=pricePerKm*distance;
        System.out.println("----- CAB BILL -----");
        System.out.println("Customer Name : " + name);
        System.out.println("Distance      : " + distance + " km");
        System.out.println("Fare per km   : ₹" + pricePerKm);
        System.out.println("Total Fare    : ₹" + total);
        System.out.println("---------------------");
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("enter distance");
        int distance=sc.nextInt();
        fun(name, distance);
    }
}
