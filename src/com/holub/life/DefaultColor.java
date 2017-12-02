package com.holub.life;

import com.holub.ui.Colors;

import java.awt.*;

public class DefaultColor {
/*
    public Color getLive_Color ();
    public Color getDead_Color ();
    public Color getBorder_Color ();

    //Neighborhood 색깔 지정
    public Color getRedraw_Graphic();

    //universe
    public Color getBackGround_Color ();
*/
    //Resident
    private static Color Live_Color = Color.RED;
    private static Color BORDER_COLOR = Colors.DARK_YELLOW;
    private static Color DEAD_COLOR   = Colors.LIGHT_ORANGE;

    private static DefaultColor  uniqeInstance;

    /*
    private DefaultColor(){
        new DefaultColor(8,8);
    }


    private DefaultColor(int gridSize, int cellSize){
        this.gridSize = gridSize;
        this.cellSize = cellSize;
    }

    public static DefaultSize getInstance(int gridSize, int cellSize){
        if(uniqeInstance == null)
            uniqeInstance = new DefaultSize(gridSize, cellSize);
        return uniqeInstance;
    }

    public static DefaultSize getInstance(){
        if(uniqeInstance == null)
            uniqeInstance = new DefaultSize();
        return uniqeInstance;
    }

    public int getGridSize(){
        return this.gridSize;
    }

    public int getCellSize(){
        return this.cellSize;
    }

    public static DefaultSize changeSize(int gridSize, int cellSize){
        if(uniqeInstance != null){
            uniqeInstance = null;
        }
        return uniqeInstance = new DefaultSize(gridSize,cellSize);
    }
    */
}
