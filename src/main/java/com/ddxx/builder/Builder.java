package com.ddxx.builder;
/**
 * 抽象建造类，提供创建产品的共同接口，不同的产品可以有自己的具体实现
 *
 */
public interface Builder {

    /**
     * 创建引擎
     */
    public void buildEngine();

    /**
     * 创建车玻璃
     */
    public void buildGlass();

    /**
     * 创建方向盘
     */
    public void buildSteeringWheel();

    /**
     * 返回创建好的产品，为了兼容所有的产品，返回的类型定为共同的父类
     * @return
     */
    public Car getCar();
}