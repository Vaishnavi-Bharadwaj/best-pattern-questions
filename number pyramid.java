/*to print
       1
      2 2
     3 3 3
    4 4 4 4
   5 5 5 5 5
 */

 import java.util.*;
 public class Main{
     public static void main (String[] args) 
     {
         int n=5;
         for(int i=1;i<=n;i++) //for 5 rows 
         {
             for(int j=1;j<=(n-i);j++) //to print spaces before the numbers on each line
             {
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++) //to print numbers which is the row number, row number of times
             {
                System.out.print(i+" ");
             }
             System.out.println();
         }
     }    
 } 
 