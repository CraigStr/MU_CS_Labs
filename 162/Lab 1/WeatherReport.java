import java.util.Scanner;
public class WeatherReport{

    public static void main(String args[]){
        WeatherReport WeatherReport = new WeatherReport();
        WeatherReport.printWeatherReport();
    }
    
    public static void printWeatherReport(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x >= 0 && x <= 8){
            System.out.println("It is cold outside, bring a jacket!");
        } else if(x >= 9 && x <= 16){
            System.out.println("The sun is coming out, and it is getting warmer");
        }else if(x >= 17 && x <= 32){
            System.out.println("Time to sit beside the pool and relax");
        }else if(x >= 33 && x <= 45){
            System.out.println("Too hot, can't move!");
        }else if(x > 45 || x < 0){
            System.out.println("Not a valid number!");
        }
    }
    
}