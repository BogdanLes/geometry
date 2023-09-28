package ro.scoalainformala.shapes;

public class Rectangle extends Shape {

    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public void setValues(float l, float w) {
        length = l;
        width = w;
    }

    @Override
    public float getArea() {
        return length * width;
    }

    public float getDiagonalRectangle() {
        float dr = length * length + width * width;
        return (float) Math.sqrt(dr);
    }

    @Override
    public float getPerimeter() {
        return 2 * (length + width);
    }
}
