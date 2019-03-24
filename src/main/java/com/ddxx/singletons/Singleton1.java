package com.ddxx.singletons;

/**
 * 
 * 饿汉式 特点：饿汉式提前实例化，
 * 没有懒汉式中多线程问题，但不管我们是不是调用getInstance()都会存在一个实例在内存中
 */
public class Singleton1 {
	private Singleton1() {
	}

	private static Singleton1 instance = new Singleton1();

	public static Singleton1 getInstance() {
		return instance;
	}
}
