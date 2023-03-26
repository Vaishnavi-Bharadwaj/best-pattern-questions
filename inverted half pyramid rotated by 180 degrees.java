/* to print an inverted half pyramid rotated by 180° 
   for eg:    *
             **
            ***
           ****
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=4;
	    for(int i=1;i<=4;i++) //for 4 rows 
	    {
	        for(int j=1;j<=n-i;j++) //to print spaces before the stars i.e, n-i spaces(for eg 3 spaces in the first case and so on)
	        {
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i;j++)   // no.of stars printed should be same as the row number
	        {
	           System.out.print("*");
	        }
	        System.out.println();  // to move to the next line
        }
    }
}
