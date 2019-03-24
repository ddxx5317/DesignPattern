package com.ddxx.builder;

public class Test {
	public static void main(String[] args) throws Exception {
		Director director = new Director(new BuilderCar());
		Car car = director.construct();
		System.out.println(car);
	}
}