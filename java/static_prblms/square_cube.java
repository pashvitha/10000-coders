public class square_cube {
    static int num=5;
    public static int square(){
        int a=num*num;
        return a;
    }
    public static void cube(){
        int b=square();
        System.out.println("cube is"+b*num);
    } 
    public static void main(String[] args) {
        cube();
    }


    

    
}
