package task1;

import java.util.Scanner;

public class divisiblity_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println("yes divisible");
        }
        else{
            System.out.println("not divisible");
        }
    }
}
