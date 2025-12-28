public class fun_prime{
    // only for(n>=2)
/*    public static boolean isprime(int n){
        // corner cases
        // 2
        if(n==2){
            return true;
        }
       // boolean isprime = true; // let aasume
        for(int i = 2; i<=n-1;i++){
            if(n % i==0){ // completely dividing
           // isprime = false ;
           return false;
          //  break;

            }
            
        }
           //return isprime;
           return true;
    } */
       public static boolean isprime(int n ){
        if(n==2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

       }


    public static void main ( String args [])
    {
       System.out.println(isprime(1120));
    }
}