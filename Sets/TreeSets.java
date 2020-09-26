package Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<Integer> value = new TreeSet<>(); //doesn'yt allowed duplicates , give ascending order of values.
		
		value.add(3);
		value.add(1);
		value.add(5);
		value.add(3);
		
		
		for(int i:value)
		{
			System.out.println(i);
		}

	}

}
