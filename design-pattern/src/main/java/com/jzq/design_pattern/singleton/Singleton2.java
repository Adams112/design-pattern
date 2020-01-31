package com.jzq.design_pattern.singleton;

public class Singleton2 {
	/*
	 * classloader机制保证初始化单例时只有一个线程，线程安全
	 * classloader机制保证初始化Singleton类时不会初始化内部类，
	 * 只有调用getInstance方法时才会实例化，懒惰加载
	 */
	public static void main(String[] args) {
		Singleton2 instance = Singleton2.getInstance();
	}
	
	private Singleton2() {}
	
	private static class SingletonHolder {
		public static final Singleton2 instance = new Singleton2();
	}
	
	public static Singleton2 getInstance() {
		return SingletonHolder.instance;
	}
}
