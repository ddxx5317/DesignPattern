package com.ddxx.singletons;

/**
 * 特点：内部类式中，实现了延迟加载，只有我们调用了getInstance(),才会创建唯一的实例到内存中.
 * 并且也解决了懒汉式中多线程的问题.解决的方式是利用了Classloader的特性. 
 *
 */
public class Singleton4 {
	//私有构造方法
	private Singleton4() {
	}

	//静态内部类
	private static class SingletonHoledr {
		private static Singleton4 instance = new Singleton4();
	}

	public static Singleton4 getInstance() {
		return SingletonHoledr.instance;
	}
}