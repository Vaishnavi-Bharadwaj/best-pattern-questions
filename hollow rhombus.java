/*to print the pattern
  
       *****
      *   *
     *   *
    *   *
   *****    

 */
import java.util.*;
public class Main{
    public static void main(String args[]){
        int n=5; //here only 1 var is sufficient since the it is a 5*5 rhombus
        for(int i=1;i<=n;i++) //for 5 rows
        {
            for(int j=1;j<=(n-i);j++) //to print the spaces before the stars 
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++) //to print the stars on each line
            {
                if(j==1 || j==n || i==1 || i==n) //to print stars only on the boundary
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();   //to move to the next line
        }
    }
}