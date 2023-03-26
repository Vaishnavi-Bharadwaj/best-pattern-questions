/* to print the pattern
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    int number=1; // a var to print numbers in each line 
	    for(int i=1;i<=n;i++) //for 5 rows 
	    {
	        for(int j=1;j<=i;j++)   // no.of numbers printed should be same as the row number
	        {
	            System.out.print(number+" "); //to print number values  
	            number++;                     //to increment the number value when moved to the next line
	        }
	        System.out.println();  // to move to the next line
        }
    }
}