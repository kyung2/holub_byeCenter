package com.holub.life.speed;

public class Slow implements Speed {
    @Override
    public String getName() {
        return "slow";
    }

    @Override
    public int getPeriod() {
        return 150;
    }


}
