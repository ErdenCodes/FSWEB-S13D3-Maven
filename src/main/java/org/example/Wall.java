package org.example;

public class Wall {
    double width ;
    double height ;


    public Wall (double width , double height) {
       this.width = width ;
       this.height = height ;
    }

    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setWidth(double value) {
        width = (value < 0) ? 0 : value ;
    }
    public void setHeight(double value) {
        height = (value < 0) ? 0 : value ;
    }
    public double getArea() {
        return width * height;
    }
}
