import java.util.*;
public class array{
    public static void main (String args []){
       /* int marks[] = new int [50]; // create  , static
        int numbers [] ={1 , 2 , 3}  // array ele
        int moreNumber[]={4, 5, 6};
        String fruit[]= {"apple", "mango", "orange"}; // string create
        */
       int marks []= new int [100];  //create
       Scanner sc = new Scanner(System.in);
       marks[0]= sc.nextInt();  // input
       marks[1]= sc.nextInt();
       marks[2]= sc.nextInt();
       System.out.println("Phy :"+ marks[0]);  //output
          System.out.println("che :"+ marks[1]);
             System.out.println("math :"+ marks[2]);
            // marks[2] = 100;  // update
            //marks[2]= marks[2]+1;
             System.out.println("math:"+marks[2]);
             int percentage = (marks [0]+ marks[1]+marks[2])/3;
             System.out.println("percentang = "+ percentage +" %" );
             System.out.println("length of array :" + marks.length);


    }

}