import java.util.Scanner;

public class OddEven{
    public static void main(String args[]){
        OddEven OddEven = new OddEven();
        Scanner sc = new Scanner(System.in);
        System.out.println(OddEven.isEven(sc.nextInt()));
    }
    
    public String isEven(int num1){
        if (num1 < 0) return "Not a valid entry!";
        else if(num1 % 2 == 0) return "Even";
        else return "Odd";
    }
    
}