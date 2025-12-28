public class DtoB{
    public static void DecimalTOBinary( int n){
        int myNum = n;
        
        int pow = 0;
        int binary = 0;
        while (n >0){
             int rem = n % 2;
            binary += rem * Math.pow(10 , pow);
            pow ++ ; 
            n = n/2;
            System.out.println("binary of " + myNum + "="+ binary);
        }
    }
    public static void main( String args []){
        DecimalTOBinary(7);

    }
}