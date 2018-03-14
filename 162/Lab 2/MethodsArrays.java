import java.util.Scanner;

public class MethodsArrays{
    public static void main (String[] args) {
        int[] x = fillArray();
        System.out.println("Sum = " + sumArray(x));
        System.out.println("Average = " + avgArray(x));
        printArray(x);
    }
    
    public static int[] fillArray(){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[sc.nextInt()];
        for (int i = 0; i < x.length; i++){
            x[i] = sc.nextInt();
        }
        return x;
    }
    
    public static int sumArray(int[] x){
        int y = 0;
        for (int i = 0; i < x.length; i++){
          y += x[i];
        } 
        return y;
    }
    
    public static double avgArray(int[] x){
        double y = 0;
        for (int i = 0; i < x.length; i++){
            y += x[i];
        } 
        return y / x.length;
    }
    
    public static void printArray(int[] x){
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        } 
    }
    
}