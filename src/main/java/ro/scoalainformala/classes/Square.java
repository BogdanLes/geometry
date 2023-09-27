package ro.scoalainformala.classes;

public class Square {

    private float side;

    public void setSide(float sv) {
        side = sv;
    }

    public float getAreaSquare() {
        return side * side;
    }

    public float getPerimeterSquare() {
        return 4 * side;
    }

    public float getDiagonalSquare() {
        return (float) Math.sqrt(2) * side;
    }

}
