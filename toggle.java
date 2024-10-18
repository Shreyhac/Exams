import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toggle(str));
    }

    public static String toggle(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                result += (char) (str.charAt(i) - 'a' + 'A');

            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                result += (char) (str.charAt(i) - 'A' + 'a');
            } else {
                result += str.charAt(i);
            }

        }
        return result;
    }

}
