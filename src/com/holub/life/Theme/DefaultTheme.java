package com.holub.life.Theme;

import com.holub.ui.Colors;
import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

import java.awt.*;

public class DefaultTheme implements ITheme,VisitorElement {

    //cell
    Color c;
    public String getName() {

        return "Defualt";
    }


    public Color getLive_Color() {
      //  c= new Color(255,168,190);

        return Color.RED;
    }

    public Color getDead_Color() {

        return Colors.LIGHT_YELLOW;
    }

    public Color getBorder_Color() {

        return Colors.DARK_YELLOW;
    }

    //Neighborhood 색깔 지정
    public Color getRedraw_Graphic() {

        return Colors.LIGHT_ORANGE;
    }

    public Color getRedraw_Selection_Graphic() {
       // c= new Color(178,57,88);

        return Color.BLUE;
    }

    //universe //backgroud 는 어차피 덮히니까..
    public Color getBackGround_Color (){
        return Color.white;
    };
    @Override
    public void accept(MyVisitor visitor) {

        visitor.visit(this);
    }

    @Override
    public String getMenuName() {
        return "Defualt";
    }
}