package com.ddxx.decorator;
public class Test {
 
	public static void main(String[] args) {
		ISource source = new Source();
		ISource obj = new Decorator(source);
		obj.method();
	}
}
