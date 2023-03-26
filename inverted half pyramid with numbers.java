/* to print the pattern
    1 2 3 4 5
    1 2 3 4
    1 2 3 
    1 2
    1
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++) //for 5 rows 
	    {
	        for(int j=1;j<=n-i+1;j++)   // we use n-i+1 since when i=1, the numbers prinetd should be 1 to 5, when i=2 numbers from 1 to 4 etc
	        {
	            System.out.print(j); //to print j value instead of stars 
	        }
	        System.out.println();  // to move to the next line
        }
    }
}