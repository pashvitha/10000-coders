package task1;

import java.util.Scanner;



public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int a=sc.nextInt();
        if(a%2!=0){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}
