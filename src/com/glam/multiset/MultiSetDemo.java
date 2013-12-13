package com.glam.multiset;

import java.util.Iterator;

import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;

public class MultiSetDemo {

	public static void main(String[] args) {
		MultiSetDemo m = new MultiSetDemo();
		m.multisetMethod();
	}
	
	
	public void multisetMethod()
	{
		  Multiset<String> set = LinkedHashMultiset.create();

		  set.add( "Cars");
	      set.add( "Flower");
	      set.add( "Flower");
	      set.add( "Cars");
	      set.add( "Cars");

	      Iterator<String> itr = set.iterator();
	 	 while(itr.hasNext())
		 {
			System.out.println("Output #  " + itr.next());
			
		 }
	}
	
}


