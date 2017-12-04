package com.holub.life;

public class DefaultSize {
    private static int gridSize = 8;
    private static int cellSize = 8;

    private static DefaultSize  uniqeInstance;

    private DefaultSize(){
        new DefaultSize(8,8);
    }

    private DefaultSize(int gridSize, int cellSize){
        this.gridSize = gridSize;
        this.cellSize = cellSize;
    }

    public synchronized static DefaultSize getInstance(int gridSize, int cellSize){
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

    public synchronized static DefaultSize changeSize(int gridSize, int cellSize){
        if(uniqeInstance != null){
            uniqeInstance = null;
        }
        return uniqeInstance = new DefaultSize(gridSize,cellSize);
    }
}
