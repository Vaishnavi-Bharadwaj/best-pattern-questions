/* to print the pattern
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++) //for 5 rows 
	    {
	        for(int j=1;j<=i;j++)   // no.of numbers printed should be same as the row number
	        {
	            if((i+j)%2==0)      //in the given pattern, we find that if the sum of indices of row and col is even, 1 is printed else 0 is printed
	                System.out.print("1 ");
	            else
	                System.out.print("0 ");
	        }
	        System.out.println();  // to move to the next line
        }
    }
}