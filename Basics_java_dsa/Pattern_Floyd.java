public class Pattern_Floyd {
    public static void floyds_triangle(int n){
        int counter = 1;
        //outer
        for(int i=1;i<=n;i++){
            //inner -how many times will counter be printed
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyds_triangle(5);

    }
    
}
