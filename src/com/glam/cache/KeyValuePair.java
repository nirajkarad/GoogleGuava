package com.glam.cache;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class KeyValuePair {
	
	public Map<String, String> returnKeyValuePair(List<String> l) {
		Map<String,String> map = new HashMap<String, String>();
    	  map.put(l.get(0),"Flower is Rose");
    	  map.put(l.get(1),"Fruit is Mango");
    	  map.put(l.get(2),"Car is MercedesBenz");
    	  map.put(l.get(3),"Company is Glam Media");
		return map;
	}
}
