import java.util.*;
        
public class ter {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       // ternary operator

       String type =(num%2==0)?"even":"odd";
       System.out.println(type);
    }
}