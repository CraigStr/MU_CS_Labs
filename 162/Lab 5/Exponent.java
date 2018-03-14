import java.util.Scanner;

public class Exponent{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        System.out.println(powerTo(o, o, sc.nextInt()));
    }
    
    public static int powerTo(int m, int o, int n){
        if(n == 1) return m;
        return powerTo(m * o, o, n - 1);
    }
}