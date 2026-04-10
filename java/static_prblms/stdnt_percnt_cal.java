
import java.util.Scanner;

public class stdnt_percnt_cal {
    public static void fun(String name,int mar1,int mar2,int mar3){
        int totl=mar1+mar2+mar3;
        double percent= (totl/300.0) *100;
        System.out.println("percentage is "+percent);
    } 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter marks1");
        int marks1=sc.nextInt();
        System.out.println("enter marks2");
        int marks2=sc.nextInt();
        System.out.println("enter marks3");
        int marks3=sc.nextInt();
        fun(name, marks1, marks2, marks3);
    }
}
