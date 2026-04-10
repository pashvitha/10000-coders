public class student_perctag {
    static int marks1=78;
    static int marks2=85;
    static int marks3=90;

    public static int total(){
        int ans=marks1+marks2+marks3;
        return ans;
    }

    public static void percentage(){
        int a=total();
        System.out.println("percentage is"+(a/300.0)*100);
    }
    public static void main(String[] args) {
        percentage();
    }
}
