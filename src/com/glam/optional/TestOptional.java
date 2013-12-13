package com.glam.optional;

import com.google.common.base.Optional;

public class TestOptional {
	
	public static void main(String[] args) {
		
		String str=null;
		
		Optional<String> val = Optional.fromNullable(str);
		
		System.out.println("Val is Present "+ val.isPresent());
		System.out.println("or "+ val.or("Default"));
		
		Optional<String> obj = Optional.of("story");
		
		System.out.println("Obj is Present "+ obj.isPresent());
		System.out.println("or "+ obj.or("Nick"));
		System.out.println("get "+ obj.get());	
	
		Optional<String> o = Optional.absent();
		
		System.out.println("O is Present "+o.isPresent());
		System.out.println("or "+ o.or("Absent"));
		
}

}
