package com.holub.life.speed;

import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

public class Medium implements Speed,VisitorElement{
    @Override
    public String getName() {
        return "medium";
    }

    @Override
    public int getPeriod() {
        return 70;
    }

    @Override
    public String getMenuName() {
        return "Medium";
    }

    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }
}
