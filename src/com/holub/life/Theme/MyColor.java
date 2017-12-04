package com.holub.life.Theme;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import com.holub.life.Cell;
import com.holub.life.Universe;
import com.holub.life.speed.*;
import com.holub.ui.*;
public class MyColor {

    //default조정

    private static Color LIVE_COLOR = Color.RED;
    private static Color BORDER_COLOR = Colors.DARK_RED;
    private static Color DEAD_COLOR = Colors.LIGHT_YELLOW;
    private static Color BackGround_COLOR = Colors.ALICEBLUE;
    private static Color GRAPHIC_COLOR = Colors.LIGHT_ORANGE;
    private static Color GRAPHIC_SELECTION_COLOR = Color.BLUE;

    private static MyColor ourInstance = new MyColor();

    public static MyColor getInstance() {
        return ourInstance;
    }

    private ITheme t;
    private MyColor() {
        t =  new DefaultTheme();
    }


    //set theme 부분
    public void setTheme(ITheme t) {
        this.t = t;
        Universe.instance().repaint();

    }

    public ITheme getT() {
        return t;
    }

    ArrayList<VisitorElement> getSpeeds(){
        ArrayList<VisitorElement>elements = new ArrayList<>();
        elements.add(new DefaultTheme());
        elements.add(new Blue());
        elements.add(new Green());
        elements.add(new Red());
        return elements;
    }
    public void addMenus(MyVisitor visitor){
        for(VisitorElement element:getSpeeds()){
            element.accept(visitor);
        }
    }
}


