import java.util.Scanner;

public class FindSubStrings{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkForSub(sc.nextLine(), sc.nextLine(), sc.nextInt()));
    }
    
    public static boolean checkForSub(String s, String t, int n){
        if(n == 0) return true;
        if (s.length() < t.length()) return false;
        try{
            if(t.equals(s.substring(0, t.length()))) n--;
            s = s.substring(1);
        } catch (StringIndexOutOfBoundsException e){
            return false;
        }
        return checkForSub(s, t, n);
    }
}