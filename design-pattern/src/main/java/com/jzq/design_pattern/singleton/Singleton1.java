package com.jzq.design_pattern.singleton;

public class Singleton1 {
	
	public static void main(String[] args) {
		Singleton1 instance = Singleton1.getInstance();
	}
	
	public static volatile Singleton1 instance;
	
	private Singleton1() {}
	
	// 双检锁/双重校验锁, 线程安全, 懒惰加载
	public static Singleton1 getInstance() {
		if(instance == null) {
			synchronized (Singleton1.class) {
				if(instance == null) {
					instance = new Singleton1();
				}
			}
		}
		return instance;
	}
}
