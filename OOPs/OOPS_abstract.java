

public class OOPS_abstract {

    public static void main(String args[]){
        horse h = new horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);

    }

    
}
abstract class Animal{
    String color;
    Animal (){  // create constructor of abstract class
        color = "brwon";
    }

    void eat(){  // non-abstract method
        System.out.println("animal eats");
    }
    abstract void walk();  // abstract method
}
class horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    } 
}

    class chicken extends Animal{
        void changeColor(){
            color = "yellow";
        }
        void walk(){
            System.out.println("walk on 2 legs");
        
    }
}

