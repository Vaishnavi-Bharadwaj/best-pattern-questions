// to print 4*5 hollow rectangle 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int m=4;
	    int n=5;
	    for(int i=1;i<=m;i++) //for rows
	    {
	        for(int j=1;j<=n;j++) //for cols
	        {
	            if(j==1 || j==n || i==1 || i==m) //to print '*' only on the boundary since it is a hollow rectangle
	                System.out.print("*"); 
	            else 
	                System.out.print(" ");     //to print space otherwise 
	        }
	        System.out.println(); //to move to the next line
	    }
	
	}
}