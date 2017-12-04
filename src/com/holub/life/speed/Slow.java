package com.holub.life.speed;

import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

public class Slow implements Speed ,VisitorElement{
    @Override
    public String getName() {
        return "slow";
    }

    @Override
    public int getPeriod() {
        return 150;
    }

    @Override
    public String getMenuName() {
        return "Slow";
    }

    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }
}
