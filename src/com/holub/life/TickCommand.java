package com.holub.life;

import java.awt.*;

public class TickCommand implements Command{

    Clock clock;

    @Override
    public void execute(){
        clock.tick();
    }

    @Override
    public void undo() {

    }
}
