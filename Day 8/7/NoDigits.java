import java.io.*;
import java.util.*;
Class NoDigits
{
	public int NoDigits(int input1)
	{
		int count=0;
    		while(input1!=0)
    		{
        			input1=input1/10;
       			 count++;
    		}
    		return count;
	}
}
