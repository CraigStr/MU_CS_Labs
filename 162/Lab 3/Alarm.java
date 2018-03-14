import java.util.Scanner;
public class Alarm{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.matches("[0-9]*(1234)[0-9]*") && s.length() <= 10) System.out.println("Alarm Deactivated");
        else System.out.println("Alarm Activated");
    }
}