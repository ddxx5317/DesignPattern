package com.ddxx.builder;

/**
 *  具体建造类
 */
public class BuilderCar implements Builder {
	private Car car = new Car();

	@Override
	public void buildEngine() {
		car.setEngine("中国制造");
	}

	@Override
	public void buildGlass() {
		car.setGlass(1000L);
	}

	@Override
	public void buildSteeringWheel() {
		car.setSteeringWheel("防滑");
	}

	@Override
	public Car getCar() {
		return car;
	}
}
