
import java.util.Scanner;

public class current_bill_generator {
    public static void fun(String name,int units){
        int cst_per_unit=100;
        int total=units*cst_per_unit;

        System.out.println("current bill"); 
        System.out.println("customer name"+name);
        System.out.println("units"+units);
        System.out.println("total"+total); 

    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();

        System.out.println("enter units");
        int units=sc.nextInt();
        fun(name, units);
    }
}
