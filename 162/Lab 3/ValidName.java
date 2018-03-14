import java.util.Scanner;

public class ValidName{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        while((!s.matches("[A-Z][a-z]+")) || (s.length() >= 25)){
            System.out.println(s + "\nName is NOT valid");
            s = sc.next();
        }
        System.out.println(s + "\nName is valid");
    }
}