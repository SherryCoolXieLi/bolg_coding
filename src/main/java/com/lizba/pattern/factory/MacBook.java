package com.lizba.pattern.factory;

/**
 * <p>
 *      苹果电脑
 * </p>
 *
 * @Author: Liziba
 * @Date: 2021/6/28 22:09
 */
public class MacBook implements ILaptop {

    @Override
    public void coding() {
        System.out.println("coding on MacBook...");
    }

    @Override
    public void playGame() {
        System.out.println("play game on MacBook...");
    }
}
