public class OOPS_inheritance {
    public  static void main(String args []){
         // Fish shark = new Fish();
          //shark.eat();
         // Dog doddy = new  Dog();
          //doddy.eat();
          //doddy.legs = 4;
          //System.out.println(doddy.legs);

         }
    
}
// Single level inheritance
// Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }

}

class Mammal extends Animal{
    void  walk(){
        System.out.println("walks");

    }
    class Fish extends Animal{
        void  swim(){
            System.out.println("swim");
    
        }
        class    Bird   extends Animal{ // hierarchical inheritance
            void  fly(){
                System.out.println("fly");
        
            }
            

}
//class Dog extends Mammal{  // multi level inheritance
  //String bread;
//}

// derived class 
//class Fish extends Animal{
  //  int fins;
    //void swin(){
      //  System.out.println("swins in water");
    //}

//}
