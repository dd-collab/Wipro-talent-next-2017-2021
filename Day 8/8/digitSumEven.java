import java.io.*;
import java.util.*;
Class UserMainCode
{
	public int EvenSum(int input1)
	{
		int r,sumeve=0;
    		while(input1!=0)
    		{
       			 r=input1%10;
        			input1=input1/10;
        			if(r%2==0)
        			{
           				 sumeve=sumeve+r;
       			}
   		 }
    		return sumeve;
	}
}
