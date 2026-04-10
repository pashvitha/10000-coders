
import java.util.Scanner;

public class moblie_data_uasgereport {
    public static void fun(String name,int used_data,int tot_data){ 
        int remaining=tot_data-used_data;
        double percent = (used_data / (double) tot_data) * 100;
        System.out.println("----- DATA USAGE REPORT -----");
        System.out.println("User Name      : " + name);
        System.out.println("Data Used      : " + used_data + " MB");
        System.out.println("Total Data     : " + tot_data + " MB");
        System.out.println("Remaining Data : " + remaining + " MB");
        System.out.println("Usage          : " + percent + "%");
        System.out.println("------------------------------");
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int used_data=sc.nextInt();
        int tot_data=sc.nextInt();
        fun(name, used_data, tot_data);
    }
}
