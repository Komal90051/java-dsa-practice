public class Recursion_Question {
   public static int calc(int n){
        if(n==1){
            return 3;
        }
        return 3* calc(n-1);
    }

    public static void main(String args[]){
        
        System.out.println(calc(5));

    }
    
}
