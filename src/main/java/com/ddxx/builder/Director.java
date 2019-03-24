package com.ddxx.builder;
/**
 * 导演类，根据按照产品的建造和组装顺序组装产品
 */
public class Director {
	
    private Builder build;
    
    public Director(Builder build){
        this.build = build;
    }

    /***
     * 组成产品的方法，组成的过程可能是有顺序的
     */
    public Car construct(){
        build.buildSteeringWheel();
        build.buildGlass();
        build.buildEngine();
        return build.getCar();
    }
}