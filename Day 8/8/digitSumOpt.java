import java.io.*;
import java.util.*;
Class UserMainCode
{
	public int EvenSum(int input1,char* input2)
	{
		int r,sumeve=0,sumodd=0;
    		while(input1!=0)
    		{
       			 r=input1%10;
        			input1=input1/10;
        			if(r%2==0)
        			{
           				 sumeve=sumeve+r;
       			}
			else
			{
				sumodd=sumodd+r;
			}

   		 }
		if(input2=="even")
		{
    			return sumeve;
		}
		else
		{
			return sumodd;
		}
	}
}
