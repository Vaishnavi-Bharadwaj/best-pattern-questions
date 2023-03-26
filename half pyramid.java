/* to print a half pyramid 
   for eg: *
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
	        for(int j=1;j<=i;j++)   // no.of stars printed should be same as the row number
	        {
	            System.out.print("*");
	        }
	        System.out.println();    //to move to the next line
        }
    }
}
