
public class BtoD{

    public static void  BinaryToDecimal(int binary){
        int myNum = binary;
        int  pow =0;
        int decimal = 0;
        while(binary > 0){
            int lastdigit = binary % 10;
            decimal +=(lastdigit*(int)Math.pow(2,pow));
            pow ++;
            binary /=10; 
              // binary number ko chota karna hai
               System.out.println("Decimal of :" +myNum + "="+ decimal);
            
        }
            
    }
    public static void main(String args []){
        BinaryToDecimal(101);
        
    

        


    }
}