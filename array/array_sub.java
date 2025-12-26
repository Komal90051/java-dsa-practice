public class array_sub {
    public void sub(int numbers []){
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length;j++){
                int end =j;
                for( int k=start ;k<=end;k++){  // onlyn print
                    System.out.println(numbers[k]+" ");// subarray
                }
                System.out.println();  // new line
            }
            System.out.println(); // optional space
        }
    }
    public static void main( String args[]){
        int numbers []= { 2,4,6,8,10};
        array_sub obj = new array_sub();
        obj.sub(numbers);


    }
    
}
