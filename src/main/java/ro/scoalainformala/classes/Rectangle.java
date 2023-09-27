package ro.scoalainformala.classes;

public class Rectangle {

    private float length;
    private float width;

    public void setValues(float l, float w) {
        length = l;
        width = w;
    }

    public float getAreaRectangle() {
        return length * width;
    }

    public float getDiagonalRectangle() {
        float dr = length * length + width * width;
        return (float) Math.sqrt(dr);
    }

    public float getPerimeterRectangle() {
        return 2 * (length + width);
    }

}
