import java.util.Scanner;
public class FlightCode{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        
        while(!(i.matches("[A-Z]{2,3}[0-9]{3,4}"))){
            System.out.println(i + "\nFlight code is NOT valid");
            i = sc.next();
        }
        System.out.println(i + "\nFlight code is valid");
    }
}