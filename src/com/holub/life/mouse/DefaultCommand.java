package com.holub.life.mouse;

import com.holub.life.Cell;
import com.holub.life.Universe;
import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

import java.awt.*;
import java.awt.event.MouseEvent;

public class DefaultCommand implements MouseCommand,VisitorElement {
    @Override
    public void execute(MouseEvent e, Cell cell) {
        Rectangle bounds = Universe.instance().getBounds();
        bounds.x = 0;
        bounds.y = 0;
        cell.userClicked(e.getPoint(),bounds);
        Universe.instance().repaint();
    }

    @Override
    public String getMenuName() {
        return "Default";
    }

    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }
}
