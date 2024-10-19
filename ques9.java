// check for string palindrome 

import java.util.*;

public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(change(str));
    }

    public static String change(String A) {
        String ans = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            ans += A.charAt(i);
        }

        if (ans.equals(A)) {
            return "true";
        } else {
            return "false";
        }

    }
}
