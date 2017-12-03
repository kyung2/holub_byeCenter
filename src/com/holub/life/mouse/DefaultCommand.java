package com.holub.life.mouse;

import com.holub.life.Cell;
import com.holub.life.Universe;

import java.awt.*;
import java.awt.event.MouseEvent;

public class DefaultCommand implements MouseCommand {
    @Override
    public void execute(MouseEvent e, Cell cell) {
        Rectangle bounds = Universe.instance().getBounds();
        bounds.x = 0;
        bounds.y = 0;
        cell.userClicked(e.getPoint(),bounds);
        Universe.instance().repaint();
    }
}
