import java.util.*;
public class parameter{
    public static int sum(int a , int b){ // parameters or formal prameters
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a,b); // arguments or actual parameters
        System.out.println("sum is:"+ sum);
    }
}