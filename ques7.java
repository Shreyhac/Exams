// //Write a program to return a string from a given string s where all occurrences of 
// the first char of the string except the first occurrence have been changed to '$'.
// Input Format:

// The number of test cases. For each testcase there will be a single line of input as explained following.
// The single line consists of a string.
import java.util.*;
public class ques7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(change(str));
    }
    public static String change(String str){
        String ans = "";
        String checker = str.charAt(0);
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == checker){
                ans += str.charAt(i);
            }
            else{
                ans += '$';
            }
        }

    
}
