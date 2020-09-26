package Vectors;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();  //By default vector size is 10 , if limits exceeds , size increase
		                                     //by 100%,thread safe thats why slow.
		
		v.add(5);                      //ArrayList size increase by 50%,thready unsafe thats why fast.
		v.add(1);
		v.add(8);
		
		v.remove(1);
		
		v.add(1);
		Collections.sort(v);
		
		
		for(int i : v)
		System.out.print(i);

	}

}
