import java.util.Scanner;

public class MinValue{
    public static void main (String[] args) {
        int[] a = fillAray();
        System.out.println(minArrayIter(a));
        System.out.println(minArrayRec(a, 0));
    }
    
    public static int minArrayIter(int[] a){
        int x = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < x) x = a[i];
        }
        return x;
    }
    
    public static int minArrayRec(int[] a, int start){
        if(start == a.length -1) return a[start];
        else return Math.min(a[start], minArrayRec(a, start+1));
    }
    
    public static int[] fillAray(){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        return a;
    }
    
}