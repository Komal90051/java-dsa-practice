public class Recursion_fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);  // 1
        int fnm2 = fib(n-2);  // 2
        int fbn= fnm1 + fnm2;
        return fbn;

    }
    public static void main(String args[]){
        int n = 7;
        System.out.println(fib(n));

    }
    
}
//Time Compexity = O(2^n) exponential    bad complexity
//Space Complexity = O(n)
