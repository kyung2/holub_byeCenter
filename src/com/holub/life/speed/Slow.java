package com.holub.life.speed;

public class Slow implements Speed {
    @Override
    public String getName() {
        return "slow";
    }

    @Override
    public double getPeriod() {
        return 150;
    }

    @Override
    public void setPeriod() {

    }
}
