import java.util.Scanner;

public class StringClean{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(cleanString(sc.nextLine(), ""));
    }
    
    public static String cleanString(String s, String t){
        if(s.length() == 0) return t;
        if(t.length() == 0) {
            t += s.charAt(0);
            s = s.substring(1,s.length());
        }
        if(s.charAt(0) == (t.charAt(t.length()-1))){
            s = s.substring(1,s.length());
        }else t += s.charAt(0);
        return cleanString(s, t);
    }
}