public class Half_Pyramid_Numbers {
    public static void inverted_half_pyramidWithNumbers(int n){
        for(int i=1;i<=n;i++){  // outer
            for(int j=1;j<=n-i+1;j++){  //inner
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        inverted_half_pyramidWithNumbers(5);

    }

    
}
