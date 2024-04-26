package lectionegro10.adapter__pattern;

public class Square implements Shape {
    private double side;

    public Square (double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
