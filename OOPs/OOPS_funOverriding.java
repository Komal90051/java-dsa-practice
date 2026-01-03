public class OOPS_funOverriding {
    public static void main(String args[]){
       dear  d = new dear();
       d.eat();

    }

    
}
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class dear extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
