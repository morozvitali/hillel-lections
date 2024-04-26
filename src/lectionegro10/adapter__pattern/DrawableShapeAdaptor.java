package lectionegro10.adapter__pattern;

public class DrawableShapeAdaptor implements Drawable {
    private Shape shape;

    public DrawableShapeAdaptor(Shape shape) {
    this.shape = shape;
    }

        /*
    Це і є адаптор,
     */

    @Override
    public void draw() {
        double area = shape.getArea();

        /*
        rendering code process...
         */


    }


}
