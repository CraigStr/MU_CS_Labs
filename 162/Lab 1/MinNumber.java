import java.util.Scanner;

public class MinNumber{
    public static void main (String args[]){
        MinNumber MinNumber = new MinNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print(MinNumber.minFunction(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
    public int minFunction(int n1, int n2, int n3){
        if(n1 < n2 && n1 < n3) return n1;
        else if(n2 < n1 && n2 < n3) return n2;
        else if(n3 < n1 && n3 < n2) return n3;
        return -1;
    }
}