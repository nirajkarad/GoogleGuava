package com.glam.common;


import java.util.Arrays;
import java.util.List;

import com.google.common.base.Joiner;

public class StartGuava {
	
	public static void main(String[] args) {

		List<String> cars = Arrays.asList("Safari",null, null, "Indica","Scorpio");
		System.out.println(Joiner.on(",").skipNulls().join(cars));
	}

}
