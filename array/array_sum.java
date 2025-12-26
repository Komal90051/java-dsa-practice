public class array_sum {
    public static void main (String args []){
        int [][] nums = {{1,4,9,},{11,4,3},{2,2,3}};
        int sum = 0;
        // sum of 2nd row element
        for(int i=0;i<nums[0].length;i++){
            sum +=nums[1][i]; // 
        }
        System.out.println("sum is :" + sum);

    }
    
}
  // time complexity = O(m)  / m is the of column