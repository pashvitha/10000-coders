public class method_calling {
    static int a=10;
    static int b=4;

    public static void multiply(){
        int ans=a*b;
        System.out.println("ans is "+ans);
    //     return ans;
    }


    public static void showres(){
        multiply();
        System.out.println("calculation done");
    } 

    public static void main(String[] args) {
        showres();
    }
}
