package ro.scoalainformala.classes;

public class Square {

    private float side;
    private float areaSquare;
    private float perimeterSquare;
    private float diagonalSquare;

    public void setSide(float sv) {
        side = sv;
        areaSquare = side * side;
        perimeterSquare = 4 * side;
        diagonalSquare = (float) Math.sqrt(2) * side;
    }

    public float getAreaSquare() {
        return areaSquare;
    }

    public float getPerimeterSquare() {
        return perimeterSquare;
    }

    public float getDiagonalSquare() {
        return diagonalSquare;
    }

}
