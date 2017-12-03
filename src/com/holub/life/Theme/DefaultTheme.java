package com.holub.life.Theme;

import com.holub.ui.Colors;

import java.awt.*;

public class DefaultTheme implements ITheme {

    //cell
    Color c;
    public String getName() {

        return "Green";
    }

    public Color getLive_Color() {
        c= new Color(255,168,190);

        return c;
    }

    public Color getDead_Color() {

        return Colors.GREENERY;
    }

    public Color getBorder_Color() {


        return Colors.BLAZINGORANGE;
    }

    //Neighborhood 색깔 지정
    public Color getRedraw_Graphic() {

        return Colors.GREENERY;
    }

    public Color getRedraw_Selection_Graphic() {
        c= new Color(178,57,88);

        return c;
    }

    //universe //backgroud 는 어차피 덮히니까..
    public Color getBackGround_Color (){
        return Colors.ALICEBLUE;
    };

}