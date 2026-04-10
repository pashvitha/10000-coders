
import java.util.Scanner;

public class movie_tickt_cost {
    public static void fun(String name,int noof_tickts,int price_per_ticket){
        int total=noof_tickts*price_per_ticket;
        System.out.println("total price"+total);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int num_tickts=sc.nextInt();
        int per_tickt=sc.nextInt();
        fun(name, num_tickts, per_tickt);
    }
}
