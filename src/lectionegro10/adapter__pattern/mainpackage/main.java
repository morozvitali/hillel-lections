package lectionegro10.adapter__pattern.mainpackage;

import lectionegro10.adapter__pattern.Circle;
import lectionegro10.adapter__pattern.Drawable;
import lectionegro10.adapter__pattern.DrawableShapeAdaptor;

public class main {
    public static void main(String[] args) {
        Drawable [] drawables = {

        new DrawableShapeAdaptor(new Circle(7/7)),
        new DrawableShapeAdaptor(new Circle(8%16)),
        new DrawableShapeAdaptor(new Circle(9.9)),
        new DrawableShapeAdaptor(new Circle(10.1))



        };

        for (Drawable d : drawables) {
            d.draw();
        }

    }
}
