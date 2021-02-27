package Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CountElements {

	public static void main(String[] args) {
	System.out.print("Enter the word: ");
	Scanner sc = new Scanner(System.in);
	String s= sc.next();
	int count=0;;
	HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
	
	for(int i=0;i<s.length();i++)
	{
		if(hm.containsKey(s.charAt(i)))
				{
					count=hm.get(s.charAt(i));
					hm.put(s.charAt(i),++count);
				}
		else
		{
			hm.put(s.charAt(i), 1);
		}
	}
	System.out.println("the count of each element is : " +hm);

	}

}
