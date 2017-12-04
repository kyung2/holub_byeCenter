package com.holub.life.speed;

import com.holub.ui.MyVisitor;
import com.holub.ui.VisitorElement;

public class Agonizing implements Speed,VisitorElement {
    @Override
    public String getName() {
        return "agonizing";
    }

    @Override
    public int getPeriod() {
        return 500;
    }

    @Override
    public String getMenuName() {
        return "Agonizing";
    }

    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }
}
