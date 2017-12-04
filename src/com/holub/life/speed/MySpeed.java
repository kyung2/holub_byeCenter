package com.holub.life.speed;

import com.holub.life.Clock;
import com.holub.ui.MenuSite;
import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

import java.util.ArrayList;

public class MySpeed {
    private static MySpeed ourInstance = new MySpeed();
    private boolean isPlaying = false;
    public static MySpeed getInstance() {
        return ourInstance;
    }

    Speed thisSpeed;
    private MySpeed() {
        thisSpeed = new Agonizing();
    }
    ArrayList<VisitorElement> getSpeeds(){
        ArrayList<VisitorElement>elements = new ArrayList<>();
        elements.add(new Agonizing());
        elements.add(new Slow());
        elements.add(new Medium());
        elements.add(new Fast());
        elements.add(new EzraMiller());
        return elements;
    }
    public void addMenus(MyVisitor visitor){
        for(VisitorElement element:getSpeeds()){
            element.accept(visitor);
        }
    }
    public int getTickTime(){
        if(isPlaying){
            isPlaying=false;
            return 0;
        }else{
            isPlaying=true;
            return thisSpeed.getPeriod();
        }
    }

    public void setThisSpeed(Speed thisSpeed) {
        this.thisSpeed = thisSpeed;
        Clock.instance().startTicking(getTickTime());
        Clock.instance().startTicking(getTickTime());
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}
