
// Write a program to return a string from a given string s where all occurrences of 
// the first char of the string except the first occurrence have been changed to '$'.
import java.util.*;

public class ques10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(dollarchange(str));

    }

    static String dollarchange(String str) {
        String ans = "";
        ans = ans + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(0)) {
                ans = ans + str.charAt(i);
            } else {
                ans = ans + "$";

            }
        }
        return ans;
    }
}
