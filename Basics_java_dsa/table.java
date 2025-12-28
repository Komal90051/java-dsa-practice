import java.util.*;

public class table{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("enter any number :");
    for(int i=1;i<=10;i++){
        System.out.println("table is:"+num * i);
    }

}
}