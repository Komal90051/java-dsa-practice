import java.util.*;

public class given_rev{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rev =0;
        int n = sc.nextInt();
        while(n>0){
            int lastdigit = n%10;
            rev =rev*10 + lastdigit;
            n = n/10;
        }
        System.out.println(rev);

    }
}
        