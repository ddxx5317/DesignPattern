package com.ddxx.adapter;

/**
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，
 * 目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 *
 */
public class Adapter extends Source implements Target {
 
	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}
}
