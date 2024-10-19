// create a function that toggles a string , return type should be void and the modification should be done in the same string, withrout creating a new string
import java.util.*;
public class toggle1 {

    public static void main(String[] args) {`
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toggle(str));
    }
     static void toggle(String str){
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                str = str.substring(0,i) + (char)(str.charAt(i) - 'a' + 'A') + str.substring(i+1);
            }
            else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                str = str.substring(0,i) + (char)(str.charAt(i) - 'A' + 'a') + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
    
}

