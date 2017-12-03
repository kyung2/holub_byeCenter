package com.holub.life.Theme;

import java.awt.*;
import com.holub.ui.*;
public class MyColor {

    //default조정


    private static MyColor ourInstance = new MyColor();

    public static MyColor getInstance() {
        return ourInstance;
    }

    private ITheme t;
    private MyColor() {

    }
    public static void addMenus() {

        ThemeAdder themeAdder = new ThemeAdder();
        themeAdder.addTheme(new Blue());
        themeAdder.addTheme(new Green());
        themeAdder.addTheme(new Red());
    }


    public void setTheme(ITheme t) {}

    public ITheme getT() {
        return t;
    }
}


