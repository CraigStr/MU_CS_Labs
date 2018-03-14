import java.util.Scanner;

public class timesTen
{
    public static void main(String[] args)
    {
        
    }
	
	/*
	* Write your Recursive method
	*/
	
	
	
	 public static int [] fillArray()
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int [] filledArray = new int[x];

        for(int i = 0; i<filledArray.length; i++){
            filledArray[i] = scan.nextInt();
        }
        scan.close();
        return filledArray;
    }
}


