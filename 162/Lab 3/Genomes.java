import java.util.Scanner;
public class Genomes{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.next().matches("[cgat]+")) System.out.println("true");
        else System.out.println("false");
    }
}