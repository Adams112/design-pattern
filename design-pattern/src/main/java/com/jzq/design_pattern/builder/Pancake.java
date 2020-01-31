package com.jzq.design_pattern.builder;

// 建造者模式参考HttpClientBuilder
// 传统的建造者模式包括四个角色: Director, Builder, ConcretBuilder, Product
// 可以发布不可变对象
// 构造方法里可以做参数检查并抛出异常
public class Pancake {
	public static void main(String[] args) {
		System.out.println(Pancake.create().salt(1.3f).spice(1.1f).build());
	}
	
	
	
	private final float oil;
	private final float salt;
	private final float spice;
	
	private Pancake(PancakeBuilder builder) {
		this.oil = builder.oil > 1.0f ? builder.oil : 1.0f;
		this.salt = builder.salt;
		this.spice = builder.spice;
	}
	
	public static PancakeBuilder create() {
		return new PancakeBuilder();
	}
	
	public static class PancakeBuilder {
		private float oil;
		private float salt;
		private float spice;
		
		public PancakeBuilder oil(float oil) {
			this.oil = oil;
			return this;
		}
		
		public PancakeBuilder salt(float salt) {
			this.salt = salt;
			return this;
		}
		
		public PancakeBuilder spice(float spice) {
			this.spice = spice;
			return this;
		}
		
		public Pancake build() {
			return new Pancake(this);
		}
		
	}

	@Override
	public String toString() {
		return "Pancake [oil=" + oil + ", salt=" + salt + ", spice=" + spice + "]";
	}
}
