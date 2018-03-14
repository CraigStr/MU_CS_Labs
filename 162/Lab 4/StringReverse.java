import java.util.Scanner;

public class StringReverse{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverseString(sc.nextLine(), ""));
    }
    
    public static String reverseString(String s, String t){
        if(!(s.length() == 0)){
            t = t + s.charAt(s.length()-1);
            s = s.substring(0, s.length()-1);
            return(reverseString(s, t));
        } else return(t);
    }
    
}