package com.glam.multimaps;

import java.util.Arrays;
import java.util.Iterator;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;

public class MultiMapsDemo {

	public static void main(String[] args) {
		MultiMapsDemo m = new MultiMapsDemo();
		m.multimapMethod();
	}
	
	
	public void multimapMethod()
	{
		Multimap<String, Category> cat = LinkedListMultimap.create();
	      cat.put( "Cars", new Category( "Tata", Arrays.asList("Safari",null, null, "Indica")));
	      cat.put( "Flower", new Category( "Rose", Arrays.asList("red","yellow")));
	      cat.put( "Flower", new Category( "Lily", Arrays.asList("pink",null,"red")));
	      cat.put( "Cars", new Category( "Toyato", Arrays.asList("innova","Qualis")));
	      cat.put( "Cars", new Category( "Honda", Arrays.asList("city","","" ,null,"civic")));
	      
	    System.out.println("Printing value for Category : Cars using MultiMaps");
	      System.out.println("-----------------------------------");
	      Iterator<Category> itr = cat.get("Cars").iterator();
	 	 while(itr.hasNext())
		 {
			 Category c = itr.next();
			 c.printCategory();
		 }
	 	 
	 	System.out.println("\nPrinting value for Category : Flower using Multimaps");
	 	System.out.println("-----------------------------------");
	      Iterator<Category> itrs = cat.get("Flower").iterator();
	 	 while(itrs.hasNext())
		 {
			 Category c = itrs.next();
			 c.printCategory();
		 }

	}
	
}


