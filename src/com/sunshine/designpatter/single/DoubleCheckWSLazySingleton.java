package com.sunshine.designpatter.single;

/**
 * 双重检查
 * 
 * @author sunshine
 * 
 */
public class DoubleCheckWSLazySingleton {
	private static DoubleCheckWSLazySingleton instance = null;

	private DoubleCheckWSLazySingleton() {

	}

	public static DoubleCheckWSLazySingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckWSLazySingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckWSLazySingleton();
				}
			}
		}
		return instance;
	}
}
