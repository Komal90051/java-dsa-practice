public class Backtracking_subsets {
    public static void findSubsets(String str, String ans, int i){
        // base case 
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.print(ans +" ");
            }
            return;
        }
        //recursino(work)
        // yes choise 
        findSubsets(str, ans+str.charAt(i), i+1);
        // No choice 
        findSubsets(str, ans, i+1);
    }

    public static void main(String args[]){
        String str="abc";
        findSubsets(str, "", 0);

    }

    
}

// Time Complexity = O(n * 2^n)  ->  totalsubset = 2^n  that's why complexity is O(2^n*n)
// Space Complexity = O(n)
