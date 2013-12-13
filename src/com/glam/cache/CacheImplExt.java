package com.glam.cache;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LoadingCache;

public class CacheImplExt implements ICache{

	private KeyValuePair kv = new KeyValuePair();
	
	private List<String> list_of_keys= Arrays.asList("Flower","Fruit","Car","Company");
			
	
	private final LoadingCache<String,String> cachedMap;

	CacheLoader<String, String> loader = new CacheLoader<String, String>() 
			{
        @Override
        public String load(String key) throws Exception {
            return key.toUpperCase();
        }};
	
	
    public CacheImplExt() {
        this.cachedMap = CacheBuilder.newBuilder()
        		.maximumSize(5)
        		.recordStats()
                .expireAfterAccess(1, TimeUnit.HOURS)
                .build(loader);
    }

    @Override
    public String getValueFromCache(String a) {
        try {
        	System.out.println("Loading Cache...");
            cachedMap.putAll(kv.returnKeyValuePair(list_of_keys));
            System.out.println(" Fetching Value for ( "+a+" )");
            return cachedMap.get(a);
        } catch (ExecutionException ex) {
        	System.out.println("Exception...");
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }	
    
    public void recordStats() {
    	CacheStats stats = cachedMap.stats();
        System.out.println("Hit Rate      : "+stats.hitRate());
		System.out.println("Mis Rate      : "+stats.missRate());
		System.out.println("Load Exp Rate : "+stats.loadExceptionRate());
		System.out.println("Avg load Pnlt : "+stats.averageLoadPenalty());

	}
    
    public static void main(String[] args) {
		
		CacheImplExt c = new CacheImplExt();
		System.out.println("Fetch from cache : "+ c.getValueFromCache("Flower"));
		c.recordStats();
		
		
        
	}
}
