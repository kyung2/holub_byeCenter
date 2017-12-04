package com.holub.life.mouse;

import com.holub.life.Cell;
import com.holub.ui.MenuSite;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class MouseCommandManager
{
    MouseCommand mouse1,mouse2,mouse3;

    static MouseCommandManager mouseCommandManager;

    private MouseCommandManager() {
        mouse1 = new DefaultCommand();
        mouse2 = new AlwaysAliveCommand();
        mouse3 = new AlwaysDieCommand();
    }
    public static MouseCommandManager getInstance(){
        if(mouseCommandManager==null)mouseCommandManager=new MouseCommandManager();
        return mouseCommandManager;
    }
    public static void addMenus(){
        MenuSite.addLine(getInstance(), "Mouse:LeftClick", "Default", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInstance().setMouse1(new DefaultCommand());
            }
        });
        MenuSite.addLine(getInstance(), "Mouse:LeftClick", "ToAlive", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInstance().setMouse1(new AlwaysAliveCommand());
            }
        });
        MenuSite.addLine(getInstance(), "Mouse:LeftClick", "ToDeath", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInstance().setMouse1(new AlwaysDieCommand());
            }
        });
        MenuSite.addLine(getInstance(), "Mouse:RightClick", "Default", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInstance().setMouse3(new DefaultCommand());
            }
        });
        MenuSite.addLine(getInstance(), "Mouse:RightClick", "ToAlive", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInstance().setMouse3(new AlwaysAliveCommand());
            }
        });
        MenuSite.addLine(getInstance(), "Mouse:RightClick", "ToDeath", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInstance().setMouse3(new AlwaysDieCommand());
            }
        });
        MenuSite.addLine(getInstance(), "Mouse:CenterClick", "Default", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInstance().setMouse2(new DefaultCommand());
            }
        });
        MenuSite.addLine(getInstance(), "Mouse:CenterClick", "ToAlive", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInstance().setMouse2(new AlwaysAliveCommand());
            }
        });
        MenuSite.addLine(getInstance(), "Mouse:CenterClick", "ToDeath", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInstance().setMouse2(new AlwaysDieCommand());
            }
        });
        MenuSite.addLine(getInstance(), "Mouse:CenterClick", "Tick", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInstance().setMouse2(new TickCommand());
            }
        });

    }

    public void executeMouseEvent(MouseEvent e, Cell cell){
        switch (e.getButton()){
            case 1:
                mouse1.execute(e,cell);
                break;
            case 2:
                mouse2.execute(e,cell);
                break;
            case 3:
                mouse3.execute(e,cell);
                break;
        }
    }
    public void setMouse1(MouseCommand mouse1) {
        this.mouse1 = mouse1;
    }

    public void setMouse2(MouseCommand mouse2) {
        this.mouse2 = mouse2;
    }

    public void setMouse3(MouseCommand mouse3) {
        this.mouse3 = mouse3;
    }
}
