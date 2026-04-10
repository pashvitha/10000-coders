package task1;

import java.util.Scanner;

public class postive_neg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int a=sc.nextInt();
        if(a<0){
            System.out.println("negative num");
        } 
        else{
            System.out.println("postive num");
        }
    }
}
