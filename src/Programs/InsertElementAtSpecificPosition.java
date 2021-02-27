package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElementAtSpecificPosition {

	public static void main(String[] args) {
		Integer[] ar= {10,30,50,70,90,110};
		int position=3;
		int len=ar.length;
		ArrayList<Integer> arL = new ArrayList<Integer>(Arrays.asList(ar));
		
		arL.add(position, 200);
		System.out.println(arL);
		
		

	}

}
