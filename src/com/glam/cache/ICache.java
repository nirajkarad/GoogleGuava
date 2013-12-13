package com.glam.cache;

public interface ICache {
	
    public static final String NOT_CACHE = "NOT_IN_CACHE";

    public String getValueFromCache(final String str);

}
