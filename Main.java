import java.util.*; 
public class Main{ 
    public static void main(String args[]){
        Student s1=new Student("Neha",11,"fgfg"); 
        System.out.println(s1.name);
         System.out.println(s1.roll_no); 
         System.out.println(s1.passaword);
        Student s2= new Student(s1);
            s2.passaword="rhh"; 
            System.out.println(s2.passaword);
    }
    
} 
class Student{
    String name;
    int roll_no;
  String passaword;  
    Student (Student s1){
        this.name=name;
         this.roll_no=roll_no;
    }
     Student(String name,int roll_no,String passaword){  
         this.name=name;
         this.roll_no=roll_no;
     this.passaword=passaword;
         
     
} 
    
}