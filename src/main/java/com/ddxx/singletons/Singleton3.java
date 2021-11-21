package com.ddxx.singletons;

/**
 * 
 * @author ddxx
 *
 */
public class Singleton3 {
	private static volatile Singleton3 single; // 声明静态的单例对象的变量
	private Singleton3() {} // 私有构造方法
	public static Singleton3 getSingle() { // 外部通过此方法可以获取对象
		if (single == null) {
			synchronized (Singleton3.class) { // 保证了同一时间只能只能有一个对象访问此同步块
				if (single == null) {
					single = new Singleton3();
				}
			}
		}
		return single; // 返回创建好的对象
	}
}