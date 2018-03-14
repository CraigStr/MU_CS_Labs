import java.util.Scanner;
import java.util.Arrays;

public class MethodOverload{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int n = Integer.parseInt(s.substring(0,2).trim());
        s = s.substring(2, s.length()).trim();
        
        String m = "";
        String[] ar = s.split(" ");
        for (int i = 0; i < n; i++){
            m += ar[i] + " ";
        }
        m = m.trim();
        s = s.replace(m, "").trim();
        
        int x = Integer.parseInt(String.valueOf(s.charAt(0)));
        s = s.substring(1, s.length()).trim();
        
        int x1 = Integer.parseInt(String.valueOf(s.charAt(0)));
        s = s.substring(1, s.length()).trim();
        
        char c = s.charAt(0);
        s = s.substring(1, s.length()).trim();
        
        char c1 = s.charAt(0);
        s = s.substring(1, s.length()).trim();
        
        
        System.out.println(manipulation(s));
        System.out.println(manipulation(s, c));
        System.out.println(manipulation(s, x));
        System.out.println(manipulation(s, x, x1));
        System.out.println(manipulation(s, c, c1));
        System.out.println(manipulation(s, c, x));
    }
    
    public static String manipulation(String s){
        return s.replaceAll("[ ]", "");
    }
    
    public static String manipulation(String s, char c){
        return s.replaceAll("["+c+"]", "");
    }
    
    public static String manipulation(String s, int x){
        return s.replaceAll("["+s.charAt(x)+"]", "");
    }
    
    public static String manipulation(String s, int x, int y){
        return s.replace(s.substring(x+1, y), "");
    }
    
    public static String manipulation(String s, char c, char d){
        int j = 0;
        for (int i = s.length() -1; i >= 0; i--){
            if(s.charAt(i) == d) j = i;
        }
        return s.replace(s.substring(s.indexOf(c)+1, j), "");
    }
    
    public static String manipulation(String s, char c, int x){
        String t = s.replace(String.valueOf(c), "");
        int j = t.indexOf(c) + 1;
        return s.replace(s.substring(0, j), "");
    }
}