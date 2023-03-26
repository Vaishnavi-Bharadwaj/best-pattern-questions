/*to print the pattern
  
       *****
      *****
     *****
    *****
   *****    

 */
import java.util.*;
public class Main{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++) //for 5 rows
        {
            for(int j=1;j<=(n-i);j++) //to print the spaces before the stars in each row i.e, n-i for eg:5-1= 4 spaces for the first row and so on
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++) //to print 5 stars in each row
            {
                System.out.print("*");
            }
            System.out.println();   //to move to the next line
        } 
    }
}