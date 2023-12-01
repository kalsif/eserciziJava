package org.example;

public class Rectangle implements Shape {
    int base;
    int altezza;

    public Rectangle(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public int area() {
        return base*altezza;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}


