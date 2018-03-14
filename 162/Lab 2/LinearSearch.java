import java.util.Scanner;

public class LinearSearch{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ar = new double[sc.nextInt()];
        for (int i = 0; i < ar.length; i++){
            ar[i] = sc.nextDouble();
        }
        double d = sc.nextDouble();
        if(findElement(ar, d)) System.out.println(d + " was found in the array");
        else System.out.println(d + " was NOT found in the array");
    }
    
    public static boolean findElement(double[] ar, double d){
        for (int i = 0; i < ar.length; i++){
            if(ar[i] == d) return true;
        }
        return false;
    }
}