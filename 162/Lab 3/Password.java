import java.util.Scanner;
public class Password{
    public static void main (String[] args) {
        Password Password = new Password();
        Scanner sc = new Scanner(System.in);
        int Score = Password.score(sc.next());
        
        if(Score < 4) System.out.println("Password strength: Weak");
        if(Score < 6 && Score >= 4) System.out.println("Password strength: Fair");
        if(Score <8 && Score >= 6) System.out.println("Password strength: Good");
        if(Score <=10 && Score >= 8) System.out.println("Password strength: Strong");
    }
    
    public int score(String s){
        int Score = 0;
        if(s.length() >= 8) Score++;
        if(s.length() >= 12) Score++;
        if(s.matches(".*[a-z].*")) Score++;
        if(s.matches(".*[a-z].*[a-z].*")) Score++;
        if(s.matches(".*[A-Z].*")) Score++;
        if(s.matches(".*[a-z].*[A-Z].*")) Score++;
        if(s.matches(".*[0-9].*")) Score++;
        if(s.matches(".*[0-9].*[0-9].*")) Score++;
        if(s.matches(".*[#!?@].*")) Score++;
        if(s.matches(".*[#!?@].*[#!?@].*")) Score++;
        return Score;
    }
    
}