package com.glam.common;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;

public class FunctionsAndPredicates {

	
	private List<String> buildStringsList()
	{
		List<String> lst = new LinkedList<String>();
		lst.add("Welcome");
		lst.add("To");
		lst.add("Glam");
		lst.add("Media");
		lst.add("Pune");
		lst.add("India");
		return lst;
		
	}
	
	private void examplePredicate()
	{
		List<String> lst = buildStringsList();
		System.out.println("Original List : "+ lst);
		Collection<String> op = Collections2.
				filter(lst, Predicates.containsPattern("a$")); //String ending with "a"
		
		System.out.println("Predicate Output  : "+ op);
	}
	
	private void exampleFunction()
	{
		List<String> lst = buildStringsList();
		System.out.println("Original List : "+ lst);
		Collection<String> op = Collections2.transform(lst, new TransformDemo());
		System.out.println("Function Output  : "+ op);
	}
	
	public static void main(String[] args) {
		FunctionsAndPredicates fp  = new FunctionsAndPredicates();
		fp.examplePredicate();
		fp.exampleFunction();
	}
	
}
