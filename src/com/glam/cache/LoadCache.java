package com.glam.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LoadingCache;

public class LoadCache {

	public static void main(String[] args) {
		
		
		CacheLoader<String, String> loader = new CacheLoader<String, String>()
		{
			@Override
			public String load(String key) throws Exception
			{
				return null;
			}
		};
		
		LoadingCache<String , String> cache = CacheBuilder.newBuilder()
				.maximumSize(1000)
				.expireAfterAccess(100, TimeUnit.SECONDS).
				recordStats()
				.build(loader);

      System.out.println(" Cache Size : "+ cache.size());
		
	  Map<String,String> map = new HashMap<String, String>();
  	  map.put("Flower","Flower is Rose");
  	  map.put("Fruit","Fruit is Mango");
  	  map.put("Car","Car is MercedesBenz");
  	  map.put("Company","Company is Glam Media");
	 
		
  	  	cache.putAll(map);
  	  
		cache.put("key-100", "Value-A");
		cache.put("key-200", "Value-B");
		cache.put("key-300", "Value-C");
		cache.put("key-400", "Value-D");
		
		
		System.out.println(" Cache Size : "+ cache.size());
		
		try {
		System.out.println(" Cache.get(Flower)    =  " + cache.get("Flower"));
		System.out.println(" Cache.get(100)       =  " + cache.get("key-100"));
	
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		CacheStats stats = cache.stats();
		System.out.println("Hit Rate      : "+stats.hitRate());
		System.out.println("Mis Rate      : "+stats.missRate());
		System.out.println("Load Exp Rate : "+stats.loadExceptionRate());
		System.out.println("Avg load Pnlt : "+stats.averageLoadPenalty());
	}
	
}
