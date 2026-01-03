public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen(); // created pen object
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        BankAccount myAcc= new BankAccount();
        myAcc.username = "komalsingh";
        System.out.println(myAcc.username);
        myAcc.setPassword("abcde@123");  // not access the password , but password can change
    
    }

    
}
class Pen{
    private String color ;
     private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;

    }

  void setColor(String newColor){
    color = newColor;
  }  
  void setTip(int newTip){
    tip = newTip;
  } 

}
class BankAccount{
     public String username;
     private String password;
     public void setPassword(String pwd){
        password = pwd;
     } 


}

