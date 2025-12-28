public class m_n{
    public static void main(String args[]){
       /* int m = 5,n = 4;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){   // wrong output
                    System.out.print("*");
                }
                    System.out.print("");
                }
            }*/
        
    
 
      int  n=5;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j<=i){    //if(i<=j)
            System.out.print("*");
            }
        }System.out.println();
      }
    }
}