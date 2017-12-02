package com.holub.life.speed;

public class Fast implements Speed {

    @Override
    public String getName(){
        return "fast";
    }
    @Override
    public double getPeriod() {
        return 30;
    }

    @Override
    public void setPeriod(){

    }

}
