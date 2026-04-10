package task1;

import java.util.Scanner;

public class vowel_consont { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if("aeiouAEIOU".indexOf(ch) != -1){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }


    }
    
}
