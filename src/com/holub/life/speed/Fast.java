package com.holub.life.speed;

import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

public class Fast implements Speed ,VisitorElement{

    @Override
    public String getName(){
        return "fast";
    }
    @Override
    public int getPeriod() {
        return 30;
    }

    @Override
    public String getMenuName() {
        return "Fast";
    }

    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }
}
