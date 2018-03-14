import java.util.Scanner;

public class Factorial{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        getFactorial(sc.nextInt(), sc.nextInt());
    }
    
    public static void getFactorial(int n, int m){
        int x = 1;
        if (n > m || n < 0 || m < 0){
            System.out.println("Not a valid entry!");
            return;
        } 
        for (int i = n; i <= m; i++){
            for (int j = 2; j <= i; j++){
                x*=j;
            } 
            System.out.println(x);
            x = 1;
        } 
    }
    
}