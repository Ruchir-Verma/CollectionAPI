package Comparatorss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> value = new ArrayList<>();
		value.add(103);
		value.add(101);
		
		value.add(100);
		value.add(99);
		Comparator<Integer> comImpl = new ComImpl();		
		Collections.sort(value , comImpl);//Comparator is an interface contains the logic to compare two values
		                                  //sorting as per last digit
		for(int i : value)
			System.out.print(i);
		
		
		
		
	}

}
