/*to print the pattern
              *
             ***
            ***** 
           *******
           *******
            *****
             ***
              *
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=4;
		for(int i=1;i<=n;i++) //to print the upper half 
		{
		    for(int j=1;j<=(n-i);j++) //to print spaces
		    {
		        System.out.print(" ");
		    }
            for(int j=1;j<=2*i-1;j++) //to print the odd number of stars in each row 
            {
                System.out.print("*");
            }
            System.out.println();  //to move to the next line
        }
        for(int i=n;i>=1;i--) //to print the lower half 
		{
		    for(int j=1;j<=(n-i);j++) //to print spaces
		    {
		        System.out.print(" ");
		    }
            for(int j=1;j<=2*i-1;j++) //to print the odd number of stars in each row 
            {
                System.out.print("*");
            }
            System.out.println();  //to move to the next line
        }
    }
}

