package com.glam.common;

import com.google.common.base.Function;

public class TransformDemo implements Function<String, String>{

	@Override
	public String apply(String obj) {
		return obj.concat(" # ");
	}
	
}
