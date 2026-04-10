package task1;

import java.util.Scanner;

public class large_of_3nums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is large");
        }
        else if(b>=a && b>=c){
            System.out.println("b is large");
        }
        else{
            System.out.println("c is large");
        }
    }
}
