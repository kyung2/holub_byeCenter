package com.holub.life;

public interface Command {
    public void execute();
    public void undo();
}
