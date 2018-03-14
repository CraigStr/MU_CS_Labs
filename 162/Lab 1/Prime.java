import java.util.Scanner;
import java.util.ArrayList;
public class Prime{
    public static void main(String args[]){
        Prime Prime = new Prime();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        for (int i = s; i < t; i++){
            if(Prime.isItPrime(i) == true){
                System.out.println(i);
            }
        }
        sc.close();
        
    }
    
    public boolean isItPrime(int x){
        boolean temp = true;
            for(int j = 2; j <= x/2; j++){
                if(x%j == 0){
                    temp = false;
                }
            }
        return temp;
    }
    
}