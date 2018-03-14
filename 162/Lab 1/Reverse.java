import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Reverse{
    public static void main(String args[]){
        Reverse Reverse = new Reverse();
        Scanner sc =  new Scanner(System.in);
        System.out.println(Reverse.reverseString(sc.nextLine()));
        sc.close();
    }

    public String reverseString(String s){
        String s1 = "";
        String[] ar = s.split("");
        Collections.reverse(Arrays.asList(ar));
        for (String s2 : ar){
            s1 += s2;
        }
        return s1;
    }

}