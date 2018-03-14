import java.util.Scanner;

public class TimesTen
{
    public static void main(String[] args)
    {
        System.out.println(checkArray(fillArray(), 0));
    }
	
	public static boolean checkArray(int[] a, int b){
	    if(a.length >= 2){
            if(a[0] * 10 == a[1]) return true;
            int[] c = new int[a.length -1];
            System.arraycopy(a, 1, c, 0, c.length);
            return checkArray(c, 0);
	    } else return false;
	}
	
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


