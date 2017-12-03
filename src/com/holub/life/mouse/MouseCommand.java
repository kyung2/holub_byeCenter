package com.holub.life.mouse;

import com.holub.life.Cell;

import java.awt.event.MouseEvent;

public interface MouseCommand {
    void execute(MouseEvent e,Cell cell);
}
