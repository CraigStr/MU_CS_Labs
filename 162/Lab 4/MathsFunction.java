import java.util.Scanner;

public class MathsFunction{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(q2Interactive(n));
        System.out.println(q2Recursive(n));
    }
    
    public static int q2Interactive(int n){
        int j = 2;
        for (int i = 2; i <= n; i++){
            j = (4 * j) - (3 * i);
        }
        return j;
    }
    
    public static int q2Recursive(int n){
        if (n == 1) return 2;
        else return ((4 * q2Recursive(n-1)) - (3 * n));
    }
    
}