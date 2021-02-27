package Programs;

import java.util.Scanner;

public class RemoveDuplicateOccurence {

	public static void main(String[] args) {
		System.out.print("Enter the word: ");
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		char[] str=s.toCharArray();
		int n = str.length;
		int count=0;
		int index=0;

		for (int i=0; i<n; i++) 
		{ 
	         
		     // Check if str[i] is present before it   
		     int j;   
		     for (j=0; j<i; j++)
		     {
		        if (str[i] == str[j])
		        {
		        count++;
		          break; 
		        }
		     }
		     // If not present, then add it to 
		     // result. 
		     if (j == i) 
		        str[index++] = str[i]; 
		   }
		while(count>0)
		{
			str[index++]=(char)0;
			count--;
		}
		System.out.println(String.valueOf(str));

	}
}
