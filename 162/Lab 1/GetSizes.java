import java.util.Scanner;

public class GetSizes{
    public static void main(String args[]){
        GetSizes GetSizes = new GetSizes();
        Scanner sc = new Scanner(System.in);
        GetSizes.determineSize(sc.nextDouble() , sc.nextDouble());
        sc.close();
    }
    
    public void determineSize(double n1, double n2){
        if(n1 > n2) System.out.println("Largest = " + n1 + "\nSmallest = " + n2);
        else if (n1 < n2) System.out.println("Largest = " + n2 + "\nSmallest = " + n1);
        else System.out.println("Numbers are the same.");
    }
}