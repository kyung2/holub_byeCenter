package com.holub.life.Theme;

import com.holub.ui.MenuSite;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemeAdder {
    public void addTheme(ITheme theme){
        MenuSite.addLine(this, "Color", theme.getName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyColor.getInstance().getT();
            }
        });
    }

}
