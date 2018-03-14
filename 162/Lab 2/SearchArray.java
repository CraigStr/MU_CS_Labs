import java.util.Scanner;

public class SearchArray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String[][] ar = new String[d][d];
        for (int i = 0; i< d; i++){
            for (int j = 0; j < d; j++){
                ar[i][j] = sc.next();
            } 
        }
        String x = sc.next();
        int y = countStrings(ar, x);
        if(y > 0){
            System.out.println(x + " is contained " + y + " times in the array");
        } else System.out.println(x + " was NOT found in the array");
    }
    
    public static int countStrings(String[][] ar, String s){
        int d = 0;
        for (int i = 0; i < ar.length; i++){
            for (int j = 0; j < ar.length; j++){
                if(ar[i][j].equalsIgnoreCase(s)) d++;
            }
        }
        return d;
    }
}