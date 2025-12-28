import java.util.*;
public class fun_pro{
public static int multiple(int a , int b){
     int product = a * b;
     return product;
}
    public static void main( String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc. nextInt();
      int b = sc.nextInt();
      int product = multiple(a, b);
      System.out.println("product of two numbers :"+ product);
      
    

}
}