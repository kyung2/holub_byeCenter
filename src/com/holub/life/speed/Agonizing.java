package com.holub.life.speed;

import com.holub.life.speed.Speed;

public class Agonizing implements Speed {
    @Override
    public String getName() {
        return "agonizing";
    }

    @Override
    public double getPeriod() {
        return 500;
    }

    @Override
    public void setPeriod() {

    }
}
