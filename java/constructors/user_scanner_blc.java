package com.constructors;
import java.util.*;
public class user_scanner_blc { 
	private int id;
	private String name;
	private int age;
	
	user_scanner_blc(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
	} 
	public void display() {
        System.out.println("\nUser Details:");
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

}
