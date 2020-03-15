package com.ddxx.builder;
/**
 * 导演类，根据按照产品的建造和组装顺序组装产品
 */
public class Director {
	
    private Builder builder;
    
    public Director(Builder builder){
        this.builder = builder;
    }

    /***
     * 组成产品的方法，组成的过程可能是有顺序的
     */
    public Car construct(){
        builder.buildSteeringWheel();
        builder.buildGlass();
        builder.buildEngine();
        return builder.getCar();
    }
}