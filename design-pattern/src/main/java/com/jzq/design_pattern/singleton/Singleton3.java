package com.jzq.design_pattern.singleton;

/*
 * 使用枚举确保线程安全，非懒惰加载
 */
public enum Singleton3 {
	instance;

	private Singleton3() {}
	
	public static void main(String[] args) {
		System.out.println(Singleton3.instance);
	}

}
