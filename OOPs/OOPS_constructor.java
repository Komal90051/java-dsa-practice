public class OOPS_constructor {
   public static void main(String args[]){
    Student s1 = new Student("Komal"); // initial the valuse of constructor
    System.err.println(s1.name);
    

   } 
}
class Student{
    String name;
    int roll;
    // copy constructor
    Student(Student s1){
        this.name = s1.name;
    }

    
    Student(String name){
        this.name = name;
        System.out.println("hey , this is constructor");
    }
}