package com.glam.multimaps;

import java.util.List;

import com.google.common.base.Joiner;

public class Category
{

	private String name;
	private List<String> type;
	
	public Category(String n,List<String> l) {
		this.name = n;
		this.type = l;
	}

	public void printCategory()
	{
		System.out.println("\nCategory Name\t\t\t : "+name);
		System.out.println("Category type\t\t\t : "+type);
		System.out.println("Category type skipping nulls\t : "+ Joiner.on(",").skipNulls().join(type));
		System.out.println("Category type null replacement\t : "+Joiner.on("").useForNull(" (Reserved_for_future) ").join(type));
	}
}
