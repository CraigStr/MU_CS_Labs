import java.util.Scanner;

public class Reciprocals{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(sumTo(m, 0));
    }
    
    public static double sumTo(int m, double o){
        if(m == 0) return Math.round(o * 100.0) / 100.0;
        return(sumTo(m - 1, o + (double) 1/m));
    }
}