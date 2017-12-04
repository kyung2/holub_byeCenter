package com.holub.life.Theme;
import com.holub.ui.Colors;
import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

import java.awt.*;

public class Blue implements ITheme,VisitorElement {

    //cell
  Color c;
    public String getName() {

        return "Blue";
    }

    public Color getLive_Color () {
        c = new Color(255,202,79);

//        c = new Color(79,133,255);
        return c;
    }
    public Color getDead_Color  ()  {
        return Colors.ISLAND_PARADISE;
    }
    public Color getBorder_Color () {
        return Colors.WHITE;
    }
    //Neighborhood 색깔 지정
    public Color getRedraw_Graphic() {

        return Colors.WHITE;
    }
    public Color getRedraw_Selection_Graphic() {

        return Colors.MEDIUM_BLUE;
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
        return "Blue";
    }
}
