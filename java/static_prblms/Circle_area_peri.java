public class Circle_area_peri {
    static int  radius=5;
    double p=3.14;
    public static void area(){
        Circle_area_peri obj=new Circle_area_peri();
        System.out.println("area is"+ (obj.p*radius*radius));
    } 

    public static void perimeter(){
        Circle_area_peri obj=new Circle_area_peri();
        System.out.println("perimeter is"+(2*radius*obj.p));;
    } 
    public static void main(String[] args) {
        area();
        perimeter();
    }
}
