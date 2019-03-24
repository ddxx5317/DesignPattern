package com.ddxx.singletons;

/**
 * 懒汉式
 * 特点：在懒汉式中，有线程A和B，
 * 当线程A运行到第8行时，跳到线程B，当B也运行到8行时，两个线程的instance都为空，
 * 这样就会生成两个实例。
 * 解决的办法是同步
 *
 */
public class Singleton2 {
	private Singleton2() {}

	private static Singleton2 instance;

	public static Singleton2 getInstance() {
		if (instance == null) {
			return instance = new Singleton2();
		} else {
			return instance;
		}
	}
}