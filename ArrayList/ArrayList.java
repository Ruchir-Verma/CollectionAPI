package ArrayList;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList {
	
	public static void main(String[] args)
	{
		
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		for (int i : arr){
			System.out.print(i+" " );   //Array length is fixed , and by default 0 will be assigned .
		}
		
		
	     ArrayList values = new ArrayList<>();	//Dynamic array.Can be heterogenous ,if want homogenous , use 
	                                            // generics .
	   
	    values.add(4);
	    values.add("ruchir");
	    values.add(22.4);                    //Always append at the last
	    values.add(12.3f);
	    
	    
	    Iterator it = values.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		
		
		
	} 
}
