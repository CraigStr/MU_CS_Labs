import java.util.Scanner;

public class StringAcc{
    public static void main (String[] args) {
        StringAcc StringAcc = new StringAcc();
        Scanner sc =  new Scanner(System.in);
        System.out.println(StringAcc.match(sc.next()));
    }
    
    public boolean match(String s){
        if(s.matches("[01]+")) return true;
        else return false;
    }
}