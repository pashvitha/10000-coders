import java.util.Scanner;

public class lcm { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=(a>b)?a:b;
        int lcm=0;
        for(int i=max; ;i++){
            if(i%a==0 && i%b ==0){
                lcm=i;
                break;
            }
        } 
        System.out.println("lcm is"+lcm);
    }
    
}
