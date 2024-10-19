
// you are given a string , return a new string with the string being sorted in an alphabetical order
import java.util.*;

public class ques2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sortedd(str) + " with nlogn iterations");
        System.out.println(sortedorder(str) +" with 26n iterations");

    }

    static String sortedd(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr); //nlogn number of iterations , which is less then n square iterations
        return new String(arr);
    }
    // another method to do this with less iterations , without directly sorting the array
    // count sort approach (only works for smaller ranges of data)
    static String sortedorder(String str) {
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<26 ; i++){
            for(int j = 0 ; j <freq[i];j++){
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();


}
}

