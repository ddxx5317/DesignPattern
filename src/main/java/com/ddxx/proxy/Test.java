package com.ddxx.proxy;
public class Test {
 
	public static void main(String[] args) {
		ISource source = new Proxy();
		source.method();
	}
 
}
