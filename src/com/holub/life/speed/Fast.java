package com.holub.life.speed;

public class Fast implements Speed {

    @Override
    public String getName(){
        return "fast";
    }
    @Override
    public int getPeriod() {
        return 30;
    }



}
