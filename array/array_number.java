public class array_number {
    public static void main(String args []){
        int  [][] array= {{4,7,8},{8,8,7}};
        int n= array.length;
        int m = array[0].length;
        int count =0;
        for(int i =0; i<n;i++){
            for(int j=0;j<m;j++){
                if( array [i][j]== 7)
                 count ++; 

            }
        }   
        System.out.println("count of 7 is :" +count);
    }
    
    
}
  // time complexity = O(n*m)  = O(n^2)