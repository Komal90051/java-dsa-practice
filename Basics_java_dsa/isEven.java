public class isEven{
    public static boolean Even( int n ){
        boolean isEven = true;
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
         System.out.println(Even(9));
    }
}