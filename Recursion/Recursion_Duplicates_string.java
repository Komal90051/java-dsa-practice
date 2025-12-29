import java.util.*;
public class Recursion_Duplicates_string {
    public static void RemoveDuplicateString(String str , int idx , StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = Character.toLowerCase(str.charAt(idx));
        if(map[currChar-'a']==true){
            //duplicate
            RemoveDuplicateString(str , idx+1 , newStr , map);
        }else{
            map[currChar-'a'] =true;
            RemoveDuplicateString(str, idx+1, newStr.append(str.charAt(idx)) , map);
        }
    }
    public static void main(String args[]){
        String str = "aappnaCollege";
        RemoveDuplicateString(str, 0, new StringBuilder(""), new boolean[26]);

    }
    
}
