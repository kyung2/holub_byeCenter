package com.holub.life.Theme;

import java.awt.*;
import java.awt.event.MouseEvent;

import com.holub.life.Cell;
import com.holub.life.Universe;
import com.holub.ui.*;
public class MyColor {

    //default조정

    private static Color LIVE_COLOR = Color.RED;
    private static Color BORDER_COLOR = Colors.LIGHT_PURPLE;
    private static Color DEAD_COLOR = Colors.LIGHT_ORANGE;
    private static Color BackGround_COLOR = Colors.ALICEBLUE;
    private static Color GRAPHIC_COLOR = Colors.GREENERY;
    private static Color GRAPHIC_SELECTION_COLOR = Color.BLUE;

    private static MyColor ourInstance = new MyColor();

    public static MyColor getInstance() {
        return ourInstance;
    }

    private ITheme t;
    private MyColor() {
        t =  new DefaultTheme();

    }
    public static void addMenus() {

        ThemeAdder themeAdder = new ThemeAdder();
        themeAdder.addTheme(new Blue());
        themeAdder.addTheme(new Green());
        themeAdder.addTheme(new Red());
    }

    //set theme 부분
    public void setTheme(ITheme t) {
        this.t = t;
        Universe.instance().repaint();

    }
    public void executeMouseEvent(MouseEvent e, Cell cell) {
        int a = e.getButton();
        System.out.println(a);

    }

    public ITheme getT() {
        return t;
    }
}


