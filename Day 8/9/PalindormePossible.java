import java.io.*;
import java.util.*
Class PalindormePossible
{
public int Palindrome(int input1)
{
nt[] frequencyArr = createFrequencyArray(input1);

    int oddCharCount = 0;

    for (int ch : frequencyArr) {

      // Count characters with odd occurrence.
      if (ch % 2 != 0)
        oddCharCount++;

      // If more than one character in the string has odd occurrence then
      // palindrome cannot be formed from given string
      if (oddCharCount > 1)
        return 1;
    }

    return 2;
		
	}
	private static int[] createFrequencyArray(int input1) {
    int[] frequencyArr = new int[256];

    char[] charArray = String.valueOf(input1).toCharArray();

    for (char ch : charArray)
      frequencyArr[ch]++;

    return frequencyArr;
  }

}
