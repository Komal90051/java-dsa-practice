public class OOPS_super {
    public static void main(String args[]){
       horse h = new horse();
       System.out.println(h.color);
         

    }
    
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");


    }
}
class horse extends Animal{
    horse(){
        super();  // to access parents's class properties  , function , constructor 
        super.color="brown";
        System.out.println("horse constructor is called");
    }
}