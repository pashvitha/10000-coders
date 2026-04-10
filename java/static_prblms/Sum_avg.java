
public class Sum_avg {
    static int a=20;
    static int b=30;

    public static void main(String[] args) { 
        avg();
    } 

    public static int sum(){ 
        int sum1;
        sum1=(a+b);
        System.out.println(sum1);
        return sum1;
        
    } 

    public static void avg(){   
        // sum();
        // int avg1=(a+b)/2;
        // System.out.println("avg"+avg1); 

        int ans=sum();
        int avg1=ans/2;
        System.out.println("avg is"+avg1);
    } 
    
}
