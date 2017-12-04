package com.holub.life.Theme;

import com.holub.ui.Colors;
import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

import java.awt.*;

public class Green implements ITheme,VisitorElement {

    //cell
    Color c;
    public String getName() {

        return "메생이";
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

        return Colors.BLAZINGORANGE;
    }

    public Color getRedraw_Selection_Graphic() {
        c= new Color(178,57,88);

        return c;
    }

    //universe //backgroud 는 어차피 덮히니까..
    public Color getBackGround_Color (){
        return Colors.ALICEBLUE;
    };
    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getMenuName() {
        return "메생이";
    }
}