// to print 4*5 solid rectangle 
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
	            System.out.print('*'); //to print '*' 5 times on the same line 
	        }
	        System.out.println(); //to move to the next line
	    }
	
	}
}
