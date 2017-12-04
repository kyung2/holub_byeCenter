package com.holub.life.Theme;

import com.holub.life.Universe;
import com.holub.ui.MenuSite;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemeAdder {
    public void addTheme(ITheme theme){
        MenuSite.addLine(this, "Color", theme.getName(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyColor.getInstance().setTheme(theme);
                Universe.instance().paint(Universe.instance().getGraphics());
//                MyColor.getInstance().getT();
            }
        });
    }

}

