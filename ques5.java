// Write a program to input a String str from user and print count of uppercase and lowercase letters in it.
import java.util.*;
public class ques5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int up = 0;
        int low = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                up++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                low++;
            }
        }
        System.out.println(up);
        System.out.println(low);
    
}
}

