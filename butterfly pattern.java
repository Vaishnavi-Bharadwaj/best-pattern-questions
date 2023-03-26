/*to print the pattern
  
  *      *
  **    **
  ***  ***
  ********
  ********
  ***  ***
  **    **
  *      *

 */
import java.util.*;
public class Main{
    public static void main(String args[]){
        int n=4;
        //upper half
        for(int i=1;i<=n;i++) //for first 4 rows
        {
            for(int j=1;j<=i;j++) //to print first half of the stars
            {
                System.out.print("*");
            }
            int spaces=2*(n-i); //spaces in the above pattern in each case
            for(int j=1;j<=spaces;j++) //to print spaces for the upper half
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) //to print second half of the stars
            {
                System.out.print("*");
            }
            System.out.println(); //to move to the next line
        }
        //lower half
        for(int i=n;i>=1;i--) //for the next 4 rows 
        {
            for(int j=1;j<=i;j++) //to print first half of the stars
            {
                System.out.print("*");
            }
            int spaces=2*(n-i); //spaces in the above pattern in each case
            for(int j=1;j<=spaces;j++) //to print spaces for the upper half
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) //to print second half of the stars
            {
                System.out.print("*");
            }
            System.out.println(); //to move to the next line
        }
        
    }
}