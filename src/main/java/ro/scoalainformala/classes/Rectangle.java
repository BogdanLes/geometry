package ro.scoalainformala.classes;

public class Rectangle {

    private float length;
    private float width;
    private float areaRectangle;
    private float diagonalRectangle;
    private float perimeterRectangle;

    public void setValues(float l, float w) {
        length = l;
        width = w;
        areaRectangle = length * width;
        float dr = length * length + width * width;
        diagonalRectangle = (float) Math.sqrt(dr);
        perimeterRectangle = 2 * (length + width);
    }

    public float getAreaRectangle() {
        return areaRectangle;
    }

    public float getDiagonalRectangle() {
        return diagonalRectangle;
    }

    public float getPerimeterRectangle() {
        return perimeterRectangle;
    }

}
