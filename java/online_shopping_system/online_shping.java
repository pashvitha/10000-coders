
import java.util.Scanner;

public class online_shping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter productid");
        // int prodid=sc.nextInt();
        // sc.nextLine();

        // System.out.println("enter priduct name");
        // String prodname=sc.nextLine();

        // System.out.println("enter price");
        // int price=sc.nextInt();

        // System.out.println("enter quantity"); 
        // int quantity=sc.nextInt();
        blc obj=new blc(101, "Mobile", 15000, 5);
        blc obj1=new blc(102, "Laptop", 50000, 3);
        obj.setQuantity(10);
        System.out.println("product1");
        System.out.println("productid"+ obj.getProductid());
        System.out.println("productname"+ obj.getProducctname());
        System.out.println("price"+ obj.getPrice());
        System.out.println("quatity"+ obj.getQuantity()); 

        System.out.println("product2");
        System.out.println("productid"+ obj1.getProductid());
        System.out.println("productname"+ obj1.getProducctname());
        System.out.println("price"+ obj1.getPrice());
        System.out.println("quatity"+ obj1.getQuantity());


    }
    
} 

class blc{
    private int productid;
    private String productname;
    private double price;
    private int quantity;

    public blc(int productid,String productname,double price,int quantity) { 
        this.productid=productid;
        this.productname=productname;
        this.price=price;
        this.quantity=quantity;

    } 

    public void setProductid(int productid){
        this.productid=productid;
    } 

    public void setProductname(String productname){
        this.productname=productname;
    } 
    public void setPrice(double price){
        this.price=price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    } 

    public int getProductid(){
        return productid;
    } 
    public String getProducctname(){
        return productname;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    


}
