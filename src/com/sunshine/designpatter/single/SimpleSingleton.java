package com.sunshine.designpatter.single;

/**
 * 简单实现单例，预加载，在类加载过程中实现实例化
 * 
 * @author sunshine
 * 
 */
public class SimpleSingleton {

	private static SimpleSingleton instance = new SimpleSingleton();

	private SimpleSingleton() {

	}

	public static SimpleSingleton getInstance() {
		return instance;
	}

}
