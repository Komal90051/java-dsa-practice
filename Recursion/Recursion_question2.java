public class Recursion_question2 {
    public static long fastPower(long a , long n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return a;
        }
        long smaller = fastPower(a, n/2);
        if(n%2==0){                          // for even a^n/2 * a^n/2
            return smaller* smaller;
        }else{                                // for odd a * a^n/2 * a^n/2
            return a*smaller*smaller;
        }
    }
    public static void main(String args[]){
        long a= 2;
        long n = 32;
        System.out.println(fastPower(a,n));


    }
    
}

