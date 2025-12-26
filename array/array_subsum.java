

 public class array_subsum {
    public void maxsum(int numbers []){
        int currsum=0;
        int MaxSum= Integer.MIN_VALUE;
       // int prefix []= new int [numbers.length];
       // prefix[0] = numbers[0];
        // calculate prefix array  // for this code output not collect.
       // for(int i=1 ; i<prefix.length;i++){
         //   prefix [0] = prefix [i-1] +numbers[i];
        //}
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length;j++){
                int end =j;
               // currsum = start ==0 ? prefix[end] : prefix[end ]- prefix[start -1];
            currsum = 0;
               for( int k=start ;k<=end;k++){  // onlyn print
                    currsum += numbers[k];// subarray sum
                }
                System.out.println(currsum);
                if(MaxSum < currsum){
                    MaxSum = currsum ;
                }
            
            }
            
        }
        System.out.println("max sum = "+ MaxSum);
    }
    public static void main( String args[]){
        int numbers []= {1 , -2 , 6 , -1 , 3};
        array_subsum obj = new array_subsum();
         obj.maxsum(numbers);


    }
    
}
 
