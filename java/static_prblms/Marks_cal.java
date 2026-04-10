public class Marks_cal {
    static int sub1=85;
    static int sub2=90;
    static int sub3=80;

    public static int totalmarks(){
        int total;
        total=(sub1+sub2+sub3);
        System.out.println("total is"+total);
        return total;
    } 

    public static void avgmarks(){
        int ans=totalmarks();
        int avg=ans/3;
        System.out.println("avg is"+avg);
    } 

    public static void main(String[] args) {
        // totalmarks();
        avgmarks();
    }
    
}
