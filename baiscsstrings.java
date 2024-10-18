import java.util.*;

class basicsstrings {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(str.toUpperCase()); 
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1.concat(s2); // to concatenate two strings
        int len = s1.length() // to get the length of the string
        //how string is stored in a memory , a univeraL mapping of nos is used called ASCII values(American Standard code International INdexes , it can store upto 255 chars  , a--> 97  , b--> 98 , c-->99 ..... z-->122  ;; A-->65 ,B-->66 , C--> 67 ... Z--> 90 ;; '0'(string 0) --> 48 , '1' --> 49 ,'2'--> 50 , ..'10' -- 10 is not a character , its a string as it is a combination of two diff chars
        String s = "abcdefghijklmnopqrstuvwxyz"; // can visaulaizoe a string as a array of these chars
        for(int i = 0 ;i <s.length() ;i++  ){
            System.out.println(s.charAt(i));
        }
    }
}
