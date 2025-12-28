import java.util.*;
public class BitManipulation {
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            //even number'
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static int getIthBit(int n , int i){
        int bitMask =1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }

    }
    public static int setIthBit(int n , int i){
        int bitMask =1<<i;
        return n| bitMask;
    }
    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n , int i , int newbit){
        if(newbit==0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String args[]){
        oddOrEven(4);
        oddOrEven(11);
        oddOrEven(12);
        oddOrEven(3);
        System.out.println(getIthBit(10, 2));
        System.err.println(setIthBit(10, 1));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(isPowerOfTwo(8));

    }
    
}
