import java.io.*;
import java.util.*;
Class palindrome
{
	public int palindrome(int input1)
	{
		int r,n=0;
    		int temp=input1;
    		while(input1!=0)
    		{
       			 r=input1%10;
       			 n=(n*10)+r;
       			 input1=input1/10;
   		}
   		 if(temp==n)
    		{
        			return 2;
    		}
   		 else
    		{
       			return 1;
    		}

	}
}
    
}
