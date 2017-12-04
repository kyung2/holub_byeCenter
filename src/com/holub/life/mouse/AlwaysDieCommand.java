package com.holub.life.mouse;

import com.holub.life.Cell;
import com.holub.life.Universe;
import com.holub.ui.VisitorElement;
import com.holub.ui.MyVisitor;

import java.awt.*;
import java.awt.event.MouseEvent;

public class AlwaysDieCommand implements MouseCommand, VisitorElement {
    @Override
    public void execute(MouseEvent e, Cell cell) {
        Rectangle bounds = Universe.instance().getBounds();
        bounds.x = 0;
        bounds.y = 0;
        cell.userSet(e.getPoint(),bounds,false);
        Universe.instance().repaint();
    }

    @Override
    public String getMenuName() {
        return "ToDeath";
    }

    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }
}
