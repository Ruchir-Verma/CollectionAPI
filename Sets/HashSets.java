package Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
	
	public static void main(String[] args)
	{
		
		//HashSet stores values in random order,no duplicates allowed
		Set<Integer> value = new HashSet<>(); 
		
		value.add(3);
		value.add(1);
		value.add(5);
		value.add(3);
		value.add(-1);
		
		for(int i:value)
		{
			System.out.println(i);
		}
	}

}
