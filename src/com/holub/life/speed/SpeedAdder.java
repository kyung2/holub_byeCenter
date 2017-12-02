package com.holub.life.speed;

import com.holub.life.Clock;
import com.holub.ui.MenuSite;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpeedAdder {
    public void addSpeed(Speed speed){
        MenuSite.addLine(this, "Go", speed.getName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clock.instance().startTicking(speed.getPeriod());
            }
        });
    }

}
