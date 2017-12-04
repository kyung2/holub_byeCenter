package com.holub.life.mouse;

import com.holub.life.Cell;
import com.holub.life.Clock;
import com.holub.life.Universe;
import com.holub.life.speed.MySpeed;
import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

import java.awt.*;
import java.awt.event.MouseEvent;

public class PlayNStopCommand implements MouseCommand,VisitorElement {
    @Override
    public void execute(MouseEvent e, Cell cell) {
        Clock.instance().startTicking(MySpeed.getInstance().getTickTime());
    }

    @Override
    public String getMenuName() {
        return "Play/Stop";
    }

    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }
}
