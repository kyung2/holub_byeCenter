package com.holub.ui;

import com.holub.life.Theme.Blue;
import com.holub.life.Theme.DefaultTheme;
import com.holub.life.Theme.Green;
import com.holub.life.Theme.Red;
import com.holub.life.mouse.*;
import com.holub.life.speed.*;

public interface MyVisitor {
    void visit(AlwaysAliveCommand command);
    void visit(AlwaysDieCommand command);
    void visit(DefaultCommand command);
    void visit(PlayNStopCommand command);
    void visit(TickCommand command);
    void visit(Agonizing speed);
    void visit(EzraMiller speed);
    void visit(Slow speed);
    void visit(Fast speed);
    void visit(Medium speed);
    void visit(Blue theme);
    void visit(DefaultTheme theme);
    void visit(Green theme);
    void visit(Red theme);
}
