import java.util.*;
public class sum_eo{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        
        for(int i=1;i<=num;i++)

        {
           int x = sc.nextInt();
           if(x%2==0){
            even += x;
           }else{
            odd += x;
           }
        }
        System.out.println("sum of even element :" + even);
        System.out.println("sum of odd element:" + odd);
    }
}