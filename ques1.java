// write a function which takes a string and return another string with toggled case
import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toggleCase(str));
    }
    public static String toggleCase(String str){
        String result = "";
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                result += (char)(str.charAt(i) - 'a' + 'A');
            }
            else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                result += (char)(str.charAt(i) - 'A' + 'a');
            }
            else{
                result += str.charAt(i);
            }
        }
        return result;
    }
    
}
