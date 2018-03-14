import java.util.Scanner;

public class ValidAge{
    public static void main (String[] args) {
        ValidAge ValidAge = new ValidAge();
        Scanner sc = new Scanner(System.in);
        String s = "0";
        while (1==1){
            String i = String.valueOf(sc.next());
            s = i;
            if (!(i.matches("([0-9]|[0-9][0-9]|[1][0-4][0-9]|(150))"))){ 
                System.out.println(s + "\nAge is NOT valid");
            }
            else break;
        }
        System.out.println(s + "\nAge is valid");
    }
}