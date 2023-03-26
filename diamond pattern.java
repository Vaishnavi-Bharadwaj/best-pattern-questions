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
		    for(int j=1;j<=i;j++)   //to print first half of the stars
		    {
		        System.out.print("*");
		    }
		    for(int j=2;j<=i;j++)   //to print second half of the stars starting from 2 row excluding the first half 
		    {
		        System.out.print("*");
		    }
		  
		    System.out.println(); //to move to the next line 
		}
		for(int i=n;i>=1;i--)     //to print the lower half
		{
		    for(int j=1;j<=(n-i);j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    for(int j=2;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		  
		    System.out.println();
		}
		
	}
}
