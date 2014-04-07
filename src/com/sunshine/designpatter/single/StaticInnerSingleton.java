package com.sunshine.designpatter.single;

/**
 * 单例模式之静态内部类实现方式,实现懒加载方式，又通过jvm实现类的实例化，保证其唯一
 * 
 * @author sunshine
 * 
 */
public class StaticInnerSingleton {

	private static class SingleHodler {
		public static StaticInnerSingleton instance = new StaticInnerSingleton();
	}

	private StaticInnerSingleton() {

	}

	public static StaticInnerSingleton getInstance() {
		return SingleHodler.instance;
	}
}
