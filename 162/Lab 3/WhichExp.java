import java.util.Scanner;

public class WhichExp{
    public static void main (String[] args) {
        WhichExp WhichExp = new WhichExp();
        Scanner sc = new Scanner(System.in);
        WhichExp.match(sc.next(), "a", "b");
    }
    
    public void match(String s, String a, String b){
        boolean t = false;
        if(s.matches("a(b|a)b")){
            System.out.println("1");
            t = true;
        }
        if (s.matches("(ab)*b")){
            System.out.println("2");
            t = true;
        }
        if (s.matches("a(b|a)*")){
            System.out.println("3");
            t = true;
        }
        if (s.matches("((a|b)a)*")){
            System.out.println("4");
            t = true;
        }
        if (t == false) System.out.println("Not in the language");
    }
    
}