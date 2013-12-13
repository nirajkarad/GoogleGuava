package com.glam.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import com.google.common.collect.MapMaker;



public class CacheImpl implements ICache
{
	 public static final long EXPIRE_TIME_IN_SECONDS =TimeUnit.SECONDS.convert(1, TimeUnit.HOURS);
	 private final ConcurrentMap<String, String> cache;

    public CacheImpl()
    {
    	System.out.println("EXPIRE_TIME_IN_SECONDS : "+EXPIRE_TIME_IN_SECONDS);
        cache = new MapMaker().concurrencyLevel(1).makeMap();
        
    }

    
    @Override
    public String getValueFromCache(final String key)
    {
    	System.out.println("SetCahe");
        cache.clear();
        cache.putAll(loadCache());
        return cache.containsKey(key) ? cache.get(key) : new String(NOT_CACHE);
    }


        private Map<String, String> loadCache() {
        	System.out.println("Data");
      	  Map<String,String> map = new HashMap<String, String>();
      	  map.put("Cars","tata");
  	      map.put("Flower","rose");
  	      map.put("niraj", "karad");
          return map;

          }

          
          public static void main(String[] args) {
        	  CacheImpl obj = new CacheImpl();
			System.out.println("Fetching Value From Cache for niraj is :"+obj.getValueFromCache("niraj"));
			System.out.println("Fetching Value From Cache Marigod is :"+obj.getValueFromCache("Marigold"));
		}
}
