/* to print the pattern
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
             
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
	            System.out.print(j); //to print j value instead of stars 
	        }
	        System.out.println();  // to move to the next line
        }
    }
}

