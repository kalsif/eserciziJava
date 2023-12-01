package org.example;

public class ShapeFactory {
    public static Shape getShape(ShapeType tipo,int base, int altezza){

       switch (tipo){
           case TRIANGOLO :
               return new Triangle(base,altezza);
           case RETTANGOLO:
               return new Rectangle(base,altezza);
           default:
               return null;
        }
    }

    public static int getResul(ShapeType tipo,int base, int altezza){
        switch (tipo){
            case RETTANGOLO:
                Rectangle r1 = new Rectangle(base,altezza);
                return r1.area();
            case TRIANGOLO:
                Triangle t1 = new Triangle(base, altezza);
                return t1.area();
        }
        return 0;
    }
}
