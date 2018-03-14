import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class RemoveOdds{
    
    public static ArrayList<Integer> ar = new ArrayList<Integer>();
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        evenDigits(sc.nextInt());
        Collections.reverse(ar);
        if(ar.size() == 0) System.out.println(0);
        else System.out.println(String.valueOf(ar).replaceAll("[^0-9]+", ""));
    }
    
    public static int evenDigits(int n){
        if(n == 0) return 0;
        if(n % 2 == 0){
            ar.add(n%10);
        }
        n /= 10;
        return evenDigits(n);
    }
}