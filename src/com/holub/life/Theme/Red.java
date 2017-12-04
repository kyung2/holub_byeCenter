package com.holub.life.Theme;

import com.holub.ui.Colors;

import java.awt.*;

public class Red implements ITheme {
    //cell
    Color c;
    public String getName() {

        return "Red";
    }
    public Color getLive_Color () {

        return Colors.MAROON;
    }
    public Color getDead_Color  ()  {

        return Colors.LIGHT_ORANGE;
    }
    public Color getBorder_Color () {
        c= new Color(232,0,90);

        return c;
    }
    //Neighborhood 색깔 지정
    public Color getRedraw_Graphic() {
        c= new Color(232,0,90);

        return c;
    }

    public Color getRedraw_Selection_Graphic() {
        c= new Color(0,178,62);
        return c;
    }
    //universe //backgroud 는 어차피 덮히니까..
    public Color getBackGround_Color (){
        return Colors.ALICEBLUE;
    };

}
