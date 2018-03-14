import java.util.Scanner;

public class StarTriangle{
    public static void main(String args[]){
        StarTriangle StarTriangle = new StarTriangle();
        Scanner sc = new Scanner(System.in);
        StarTriangle.printStarTriangle(sc.nextInt());
    }
    
    public void printStarTriangle(int num){
    
        for (int i = 0; i <= num; i++){
            for (int j = 0;  j < i; j++){
                System.out.print("*");
            } 
            System.out.println("");
        } 
        
    }
}