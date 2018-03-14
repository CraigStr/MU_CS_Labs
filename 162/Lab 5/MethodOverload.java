import java.util.Scanner;

public class MethodOverload{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.next()){
            case "Square":
                System.out.println("Area: " + area(sc.nextInt()));
                break;
            case "Rectangle":
                System.out.println("Area: " + area(sc.nextInt(), sc.nextInt()));
                break;
            case "Triangle":
                System.out.println("Area: " + area(sc.nextDouble(), sc.nextInt()));
                break;
            case "Circle":
                System.out.println("Area: " + area(sc.nextDouble()));
                break;
            case "Ellipse":
                System.out.println("Area: " + area(sc.nextDouble(), sc.nextDouble()));
                break;
            default:
                System.out.println("Not a valid shape!");
        }
    }
    
    public static double area(int n){
        return Math.pow(n, 2);
    }
    public static double area(int n, int m){
        return n * m;
    }
    public static double area(double n, int m){
        return .5*n*m;
    }
    public static double area(double n){
        return Math.PI*Math.pow(n, 2);
    }
    public static double area(double n, double m){
        return Math.PI*.5*n*.5*m;
    }
}