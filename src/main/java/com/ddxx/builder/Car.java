package com.ddxx.builder;
public class Car {
    /**
     * 汽车引擎，实际应用中应该是一个对象，这里用字符串来表示
     */
    private String engine;

    /**
     * 汽车玻璃，不同的汽车大小不一样，需要根据汽车的型号计算
     */
    private double glass;

    /**
     * 汽车方向盘
     */
    private String steeringWheel;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public double getGlass() {
		return glass;
	}

	public void setGlass(double glass) {
		this.glass = glass;
	}

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", glass=" + glass
				+ ", steeringWheel=" + steeringWheel + "]";
	}
    
}