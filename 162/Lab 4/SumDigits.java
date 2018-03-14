import java.util.Scanner;

public class SumDigits{
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Result = " + recursiveSum(sc.next(), 0));
    }
    
    public static int recursiveSum(String n, int x){
        if(n.length() != 0){
            x += Integer.parseInt(String.valueOf(n.charAt(0)));
            n = n.substring(1, n.length());
            return recursiveSum(n, x);
        } else return x;
    }
    
}