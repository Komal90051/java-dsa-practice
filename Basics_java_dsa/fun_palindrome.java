import java.util.*;
public class fun_palindrome{
    public static boolean isPalindrome( int number){
      int palindrome = number;
      int rev = 0;
      while(number!=0){
        int lastdigit = number % 10;
        rev = rev * 10 + lastdigit;
        number = number/10;
        System.out.println("palindrome "+ number);
      }
      // W o

    }

    public static void main(String args[]){
        /*System.out.println("enter any no.:");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("Number :" + number+ " is a palindrome");
            System.out.println("Number :" + number+ " is a palindrome");*/
            isPalindrome(121);
        }

    }
    
  