import java.util.Scanner;

public class CountDigits{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Result = " + countEights(String.valueOf(sc.nextInt()), "1", 0));
    }
    
    public static int countEights(String s, String t, int u){
        if(s.equals("")) return u;
        if(s.charAt(0) == '8') u++;
        if(s.charAt(0) == '8') {
            if(t.charAt(t.length()-1) == '8') u++;
        }
        t += s.charAt(0);
        try{
            s = s.substring(1);
        }catch(StringIndexOutOfBoundsException e){
            return u;
        }
        return countEights(s, t, u);
    }
}