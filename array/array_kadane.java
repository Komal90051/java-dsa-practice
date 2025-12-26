public class array_kadane {
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for(int i =0; i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs <0){
                cs = 0;
            }
            ms = Math.max(cs ,ms);
        }
        System.out.println("our max subarray is :"+ ms);

    }
    public static void main(String args []){
        int numbers[] = { -2,-3,4,-1,-2,1,5,-3};
        array_kadane obj = new array_kadane();
        obj.kadanes(numbers);
    }
    
}
