//Write a program to input a String str from user and print ASCII value of all its characters line by line.
import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0 ; i <str.length(); i++){
            System.out.println((int)str.charAt(i));

        }
        
        
    }
}
