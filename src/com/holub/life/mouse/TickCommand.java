package com.holub.life.mouse;

import com.holub.life.Cell;
import com.holub.life.Clock;
import com.holub.life.Universe;
import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

import java.awt.*;
import java.awt.event.MouseEvent;

public class TickCommand implements MouseCommand ,VisitorElement{
    @Override
    public void execute(MouseEvent e, Cell cell) {
        Clock.instance().tick();
    }

    @Override
    public String getMenuName() {
        return "Tick";
    }

    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }
}
