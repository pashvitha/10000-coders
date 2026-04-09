
import java.util.*;

public class Stdnt_res_app {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter student name"); 
        String name=sc.nextLine();

        System.out.println("enter student id");
        int id=sc.nextInt(); 
        sc.nextLine();

        System.out.println("enter course name");
        String cname=sc.nextLine();

        System.out.println("enter first subject marks");
        double marks=sc.nextDouble();

        StudentRes obj =new StudentRes(name, id, cname, marks); 
        int option;

        do { 
            System.out.println("1. Add more subject marks");
            System.out.println("2. Calculate grade");
            System.out.println("3. View total marks");
            System.out.println("4. Exit"); 

            option=sc.nextInt();
            switch (option) {
                case 1: 
                    System.out.println("enter marks"); 
                    double newmarks=sc.nextInt();
                    obj.addMarks(newmarks);
                    System.out.println("added sucessfully");
                    
                    break; 
                case 2:
                    obj.calculateGrade();
                    System.out.println("grade calculated sucessfully");
                    break;
                case 3:
                    System.out.println("Total Marks: " + obj.getTotalmarks());
                    break;
                case 4:
                    System.out.println("Thank You! Result Processing Completed.");
                    break;
                default:
                    System.out.println("invalid option");
            }

        } while (option!=4); 
        
    }
} 

class StudentRes{
    private String studentName;
    private int studentId;
    private String courseName;
    private double totalMarks;

    StudentRes(String studentName,int studentId, String courseName,double totalMarks) { 
        this.studentName=studentName;
        this.studentId=studentId;
        this.courseName=courseName;
        this.totalMarks=totalMarks;

        System.out.println("Student record created successfuly"); 

    } 

    public  String getStudentname(){
        return studentName;
    } 
     
    public int getStudentId(){
        return studentId;
    } 

    public String getCourseName(){
        return courseName;
    }
    public double getTotalmarks(){
        return totalMarks;
    } 

    public void setStudentname(String studentName){
        this.studentName=studentName;
    } 

    public void setStudentId(int studentId){
        this.studentId=studentId;
    } 

    public void setCourseName(String courseName){
        this.courseName=courseName;
    } 
    public void setTotalmarks(double totalMarks){
        this.totalMarks=totalMarks;
    } 

    public void addMarks(double marks){
        if(marks<=0){
            System.out.println("Invalid marks entered");
        } 

        else{
            totalMarks+=marks;
            System.out.println("total marks are"+totalMarks);
        } 

    } 

    public void calculateGrade(){ 
        double marks1=getTotalmarks();
        if(marks1==0){
            System.out.println("no marks availble to calculate grade");
        }
        else if(marks1>=90){
            System.out.println("total marks are "+marks1 +"grade A");
        } 

        else if(marks1>=80 && marks1<=89){
            System.out.println("total marks are "+marks1+ "grade B");
        }  

        else if(marks1>=70 && marks1<=79){
            System.out.println("total marks are "+marks1 +"grade C");
        }  

        else if(marks1>=60 && marks1<=69){
            System.out.println("total marks are "+marks1 +"grade D");
        }  
        else{
            System.out.println("fail");
        } 




        

    }

    
}
