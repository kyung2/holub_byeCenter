package com.holub.life.mouse;

import com.holub.life.Cell;
import com.holub.life.Clock;
import com.holub.life.Universe;

import java.awt.*;
import java.awt.event.MouseEvent;

public class TickCommand implements MouseCommand {
    @Override
    public void execute(MouseEvent e, Cell cell) {
        Clock.instance().tick();
    }
}
