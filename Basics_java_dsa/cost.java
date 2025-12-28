import java.util.*;

public class cost{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencile = sc.nextFloat();
        float pen = sc.nextFloat();
        float era = sc.nextFloat();
        float total = pencile+pen+era;
        System.out.println("Bill is :"+total);


        // add on - with 18% tax
        float newTotal= total+(0.18f*total);
        System.out.println("bill with 18% tax:"+ newTotal);

    }
}