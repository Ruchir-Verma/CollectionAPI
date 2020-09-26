package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {    //Thread unsafe
	
	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<>();
		
		map.put(101,"Ruchir");
		map.put(103,"Laiba");
		map.put(102, "Vaishali");
		
		
		System.out.print(map);
		
		
		Set<Integer> values = map.keySet();
		
		for(int i:values)
		{
			System.out.println(i + " "+ map.get(i));   
		}
	}

}
