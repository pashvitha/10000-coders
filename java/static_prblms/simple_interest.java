public class simple_interest {
    static int principal=5000;
    static int rate=5;
    static int time =2;
    
    public static void calculateInterest(){
        int ans=(principal*rate*time)/100;
        System.out.println("ans is"+ans);
    } 

    public static void main(String[] args) {
        calculateInterest();
    }
}
