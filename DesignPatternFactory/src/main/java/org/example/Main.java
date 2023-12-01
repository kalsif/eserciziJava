package org.example;

public class Main {
    public static void main(String[] args) {
        Shape rettangolo = ShapeFactory.getShape(ShapeType.RETTANGOLO,5,10);
        Shape triangolo = ShapeFactory.getShape(ShapeType.TRIANGOLO,3,10);


        System.out.println(rettangolo);
        System.out.println(triangolo);

        int areaRet = ShapeFactory.getResul(ShapeType.RETTANGOLO,5,10);
        int areaTri = ShapeFactory.getResul(ShapeType.TRIANGOLO,3,10);

        System.out.println(areaRet);
        System.out.println(areaTri);
    }
}