package LinkedList;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList { 

	public static void main(String[] args)
	{
		
		
		List values = new ArrayList();  //List implements collection , arraylist implements lists
		
		values.add(1);
		values.add(2);
		values.add(1,3);  //Support insertion using index
		
		values.forEach(i -> System.out.print(i));
		
		System.out.println();
		Collections.sort(values);
		values.forEach(i -> System.out.print(i));
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
