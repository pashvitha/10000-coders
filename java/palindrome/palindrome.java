
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[] b=a.toCharArray();
        int l=0;
        int h=a.length()-1;
        boolean ispalindrome=true;
        while(l<=h){
            if(b[l]!=b[h]){
                ispalindrome=false;
                break;

            } 
            l++;
            h--;
        } 
        if(ispalindrome){
            System.out.println("palin");
        }
        else{
            System.out.println("Not palin");
        }
       
    }
}

