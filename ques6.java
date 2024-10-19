// // You are given uppercase string (S) and you have to return a string that is the lower case form of S.

// Uppercase strings are those which have all letters in uppercase (Example: MACHINE)

// Lowercase strings are those which have all letters in lowercase (Example: machine)
import java.util.*;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(uppr(str));

    }

    public static String uppr(String str){
     String  result = "";
     for(int i = 0 ; i <str.length() ; i++){
        if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
            result += (char)(str.charAt(i) - 'A' + 'a');
        }
        else{
            result += str.charAt(i);
        }
        
        
     }
     return result ; 

    
}
}