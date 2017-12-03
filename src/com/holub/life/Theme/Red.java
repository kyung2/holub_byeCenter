package com.holub.life.Theme;

import com.holub.ui.Colors;

import java.awt.*;

public class Red implements ITheme {
    //cell
    Color c;
    public Color getLive_Color () {
        return c;
    }
    public Color getDead_Color  ()  {

        return c;
    }
    public Color getBorder_Color () {

        return c;
    }
    //Neighborhood 색깔 지정
    public Color getRedraw_Graphic() {

        return c;
    }

    public Color getRedraw_Selection_Graphic() {

        return c;
    }
    //universe //backgroud 는 어차피 덮히니까..
    public Color getBackGround_Color (){
        return Colors.ALICEBLUE;
    };

}
