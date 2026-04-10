
import java.util.Scanner;

public class clg_idcard_printer {
    public static void idcard(String name,String course){
        System.out.println("----- STUDENT ID CARD -----");
        System.out.println("Name   : " + name);
        System.out.println("Course : " + course);
        System.out.println("----------------------------");
 
    } 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String course=sc.nextLine();
        idcard(name, course);
    }
}
