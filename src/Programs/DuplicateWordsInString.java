package Programs;

import java.util.HashMap;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		
		String str = "I am am learning java java";
		String [] ar = str.split(" ");
		int count=0;
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			if(hm.containsKey(ar[i]))
			{
					count = hm.get(ar[i]);
					hm.put(ar[i], ++count);
			}
			else
				{
				hm.put(ar[i], 1);
				}
			}
		System.out.println(hm);
		}

	}
