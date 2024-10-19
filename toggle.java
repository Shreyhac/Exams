import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toggle(str));
        System.out.println(toggleeasy(str));
    }

    public static String toggle(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                result += (char) (str.charAt(i) - 'a' + 'A');

            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                result += (char) (str.charAt(i) - 'A' + 'a'); // idhr aise - and + islie kiya hai cuz differecne hamehsa same rahega , try doing it for ascii values of upper and lower case chars , the diff is 32
            } else {
                result += str.charAt(i);
            }

        }
        return result;
    }

 // here neither n iterations nor n memory is being used 
//rather n(n+1)/ 2 memoery is being used here which is 
//nearly n^2  , the programme is higly unoptimal , 
//so this is not a good way to implement your 
//code,because of this extensive use of strings , 
//to make it optimal w will move away from string , //
//we can use diff things for that, first convert this string to a character array 
//and do the modification, after doing 
//the modification , convert again to string, 
//but its not optimal as its size will be fixed, //
//so we can create a string builder array; 

//String builder

public static String toggleeasy(String str){

    StringBuilder sb = new StringBuilder();
    int diff = Math.abs('a' - 'A');
    for(int i = 0 ; i < str.length() ; i++){
        char ch = str.charAt(i);
        if(ch >= 'a' && ch <= 'z'){
            sb.append((char)(ch - diff));
    }
    else if( ch>='A' && ch<='Z'){
        sb.append((char)(ch + diff));
    }
    else{
        sb.append(ch);
    }
    }
    return sb.toString();

}
}

