
import java.util.Scanner;

public class emple_salary_slip {
    public static void fun(String name,int basic_salary){
        double hra= (20/100.0)*basic_salary;
        double da=(10/100.0)*basic_salary;
        double total= hra+da+basic_salary;
        System.out.println("----- SALARY SLIP -----");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : ₹" + basic_salary);
        System.out.println("HRA (20%)     : ₹" + hra);
        System.out.println("DA (10%)      : ₹" + da);
        System.out.println("Total Salary  : ₹" + total);
        System.out.println("------------------------");
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();
        int salary=sc.nextInt();
        fun(name, salary);
    }
}

// HRA = 20% of basic salary  
// DA  = 10% of basic salary  