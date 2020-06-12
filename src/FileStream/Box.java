package FileStream;

import java.io.*;

public  class Box implements Serializable {
    private int width;
    private int height;

    public Box(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
