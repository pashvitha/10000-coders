package com.constructors;
import java.util.*;
public class emp_promotion_elc { 
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("before promotion");
        System.out.println("enter employe id");
        int id=sc.nextInt();
        sc.nextLine();
        
        System.out.println("enter name");
        String name=sc.nextLine();
        
        System.out.println("enter designation"); 
        String desg=sc.nextLine();
        
        System.out.println("enter salary");
        double salary=sc.nextDouble();
        
        System.out.println("enter perfomnce rating");
        int rating=sc.nextInt();
        
        emp_promotion_blc obj=new emp_promotion_blc(id, name, desg, salary, rating);
        
        System.out.println("emp id "+obj.getEmpid());
        System.out.println("emp name "+obj.getName());
        System.out.println("emp designation "+obj.getDesignation());
        System.out.println("emp salary "+obj.getSalary());
        System.out.println("emp performance rating "+obj.getPerformancerating());
        obj.promoteEmployee();
    }

}
