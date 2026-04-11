package com.constructors;

public class emp_promotion_blc { 
	private int empid;
    private String name;
    private String designation;
    private double salary;
    private int performancerating;

    emp_promotion_blc(int empid, String name, String designation, double salary, int performancerating) {
        this.empid = empid;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.performancerating = performancerating;
    } 
    
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
     

    public int getEmpid(){
        return empid;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public double getSalary(){
        return salary;
    }
    public int getPerformancerating(){
        return performancerating;
    } 

    public void promoteEmployee(){
        if(getPerformancerating()>=4){
            double sal=getSalary();
            double new_salary=sal+(sal*0.20);
            setSalary(new_salary);
            setDesignation("sr dev");
            System.out.println("after promotion");
            System.out.println("new desgnatin"+getDesignation());
            System.out.println("new desgnatin"+getSalary());
            
            
        }  
        else{
            System.out.println("no promotion");
        }
    }
    

}
