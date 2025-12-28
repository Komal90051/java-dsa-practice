public class palindrome {
    public static boolean isPalindrome(String str){
        for(int i =0;i<str.length()/2;i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                // not palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str ="madam";
        System.out.println(isPalindrome(str));


    }
      // Time Complexity = Linear Complexity O(n) 
}
