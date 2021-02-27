package Programs;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		Integer[] ar = {8,6,7,9,10,25,63,100};
		System.out.printf("The array is displayed as : %s", Arrays.toString(ar));
		System.out.println();

			int i,j,temp;
		
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<i;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.printf("Array after sort: %s", Arrays.toString(ar));
	}
		
	}


