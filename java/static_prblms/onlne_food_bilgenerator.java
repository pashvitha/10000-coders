
import java.util.Scanner;

public class onlne_food_bilgenerator {
    public static void bill_generator(String item,int quantity, int price){
        int total=quantity*price;
        System.out.println("----- FOOD BILL -----");
        System.out.println("Item      : " + item);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Price     : ₹" + price);
        System.out.println("Total Bill: ₹" + total);
        System.out.println("----------------------");
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter item");
        String item=sc.nextLine();
        System.out.println("enter quantity");
        int quantity=sc.nextInt();
        System.out.println("enter price");
        int price=sc.nextInt();
        bill_generator(item, quantity, price);
    }
}
