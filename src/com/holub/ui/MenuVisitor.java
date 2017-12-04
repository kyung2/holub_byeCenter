package com.holub.ui;

import com.holub.life.Clock;
import com.holub.life.Theme.Blue;
import com.holub.life.Theme.DefaultTheme;
import com.holub.life.Theme.Green;
import com.holub.life.Theme.Red;
import com.holub.life.mouse.*;
import com.holub.life.speed.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuVisitor implements MyVisitor{

    @Override
    public void visit(DefaultTheme theme) {

    }
    @Override
    public void visit(Red theme) {

    }

    @Override
    public void visit(Blue theme) {

    }

    @Override
    public void visit(Green theme) {

    }

    @Override
    public void visit(Fast speed) {
        MenuSite.addLine(this, "Go:속도설정", speed.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MySpeed.getInstance().setThisSpeed(speed);
//                Clock.instance().startTicking(speed.getPeriod());
            }
        });
    }

    @Override
    public void visit(Slow speed) {
        MenuSite.addLine(this, "Go:속도설정", speed.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MySpeed.getInstance().setThisSpeed(speed);
//                Clock.instance().startTicking(speed.getPeriod());
            }
        });
    }

    @Override
    public void visit(Medium speed) {
        MenuSite.addLine(this, "Go:속도설정", speed.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                MySpeed.getInstance().setThisSpeed(speed);
//                Clock.instance().startTicking(speed.getPeriod());
            }
        });
    }

    @Override
    public void visit(Agonizing speed) {

        MenuSite.addLine(this, "Go:속도설정", speed.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MySpeed.getInstance().setThisSpeed(speed);
//                Clock.instance().startTicking(speed.getPeriod());
            }
        });
    }

    @Override
    public void visit(EzraMiller speed) {
        MenuSite.addLine(this, "Go:속도설정", speed.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MySpeed.getInstance().setThisSpeed(speed);
//                Clock.instance().startTicking(speed.getPeriod());
            }
        });
    }

    @Override
    public void visit(TickCommand command) {
        MouseCommandManager manager = MouseCommandManager.getInstance();
        MenuSite.addLine(manager, "Mouse:LeftClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse1(command);
            }
        });
        MenuSite.addLine(manager, "Mouse:RightClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse3(command);
            }
        });
        MenuSite.addLine(manager, "Mouse:CenterClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse2(command);
            }
        });
    }

    @Override
    public void visit(DefaultCommand command) {
        MouseCommandManager manager = MouseCommandManager.getInstance();
        MenuSite.addLine(manager, "Mouse:LeftClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse1(command);
            }
        });
        MenuSite.addLine(manager, "Mouse:RightClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse3(command);
            }
        });
        MenuSite.addLine(manager, "Mouse:CenterClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse2(command);
            }
        });
    }

    @Override
    public void visit(AlwaysDieCommand command) {
        MouseCommandManager manager = MouseCommandManager.getInstance();
        MenuSite.addLine(manager, "Mouse:LeftClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse1(command);
            }
        });
        MenuSite.addLine(manager, "Mouse:RightClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse3(command);
            }
        });
        MenuSite.addLine(manager, "Mouse:CenterClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse2(command);
            }
        });
    }

    @Override
    public void visit(AlwaysAliveCommand command) {
        MouseCommandManager manager = MouseCommandManager.getInstance();
        MenuSite.addLine(manager, "Mouse:LeftClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse1(command);
            }
        });
        MenuSite.addLine(manager, "Mouse:RightClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse3(command);
            }
        });
        MenuSite.addLine(manager, "Mouse:CenterClick", command.getMenuName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.setMouse2(command);
            }
        });
    }
}
