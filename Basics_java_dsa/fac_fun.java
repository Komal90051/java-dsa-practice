//import java.util.*;
public class fac_fun{
    public static int factorial(int n){
         int f= 1;
         for(int i=1; i<=n ;i++){
        
        f *=i;
        }

        return f;   // f factorial of n

    }
    public static int binCoeff( int n , int r){
       int  n_fact = factorial(n);  //a
       int  r_fact= factorial (r);  // b
        int nmr_fact = factorial(n-r);  // c
        int binCoeff = n_fact / (r_fact * nmr_fact );
        return binCoeff;
    }
    public static void main (String args[]){
         //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        System.out.println("factorial is :"+ factorial(2));
        System.out.println("Binomial is :"+ binCoeff( 5 , 2));


    }
}