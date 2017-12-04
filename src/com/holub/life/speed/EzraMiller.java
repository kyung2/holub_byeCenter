package com.holub.life.speed;

import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

public class EzraMiller implements Speed ,VisitorElement{

    @Override
    public String getName(){
        return "Ezra Miller";
    }
    @Override
    public int getPeriod() {
        return 15;
    }

    @Override
    public String getMenuName() {
        return "EzraMiller";
    }

    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }
}
