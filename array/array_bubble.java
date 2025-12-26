public class array_bubble{
    public static  void swap(int [] arr , int i1, int i2 ){
        int temp = arr[i1];
        arr[i1]= arr[i2];
        arr[i2] = temp; 
    }
    public static void bubblesort(int [] arr ){
        int n = arr.length;
        for(int i= 0 ; i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j , j+1);
                }
            }
            System.out.println("After "+(i+1)+"loops");
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+ "");
            }
            System.out.println( );        
        }
    }

    public static void main( String args[])
    {
        int arr []= { 4,3,1,6,9,5};
        System.out.println("original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "");
        }
       System.out.println();
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "");
        }

    }
}