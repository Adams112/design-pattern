package com.jzq.design_pattern.factory;

public class SimpleFactory {
	public static void main(String[] args) {
		System.out.println(Factory.newInstance(ProductA.class));
		System.out.println(Factory.newInstance(ProductB.class));
	}
}

interface Product {
	
}

class ProductA implements Product {
	
}

class ProductB implements Product {
	
}

class Factory {
	public static <T extends Product> T newInstance(Class<T> clazz) {
		Product p = null;
		try {
			p = (Product) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) p;
	}
}