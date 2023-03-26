/*to print
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 
*/

import java.util.*;
public class Main{
    public static void main (String[] args) 
    {
        int n=5;
        for(int i=1;i<=n;i++) //for 5 rows
        {
            for(int j=1;j<=(n-i);j++) //to print spaces before the numbers on each row
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) //to print first half of the numbers in the reverse order and the no. of numbers printed should be same as the row number
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++) //to print second half of the numbers starting from 2 since we've already printed 1 in the first half
            {
                System.out.print(j);
            }
            System.out.println(); //to move to the next line
        }
        
    }    
} 