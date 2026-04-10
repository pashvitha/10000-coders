public class students_counter {
   static int studentcnt=0;
   
   public static void addstudents(int n){
    studentcnt+=n;
    System.out.println("cnt is"+studentcnt );

   } 
   public static void main(String[] args) {
       addstudents(5);
       addstudents(4);
       addstudents(1);
   }
   
}
