package ro.scoalainformala.classes;

public class Circle {

    private float radius;

    public void setRadius(float rad) {
        radius = rad;
    }

    public float getAreaCircle() {
        return 3.14F * radius * radius;
    }

    public float getDiameterCircle() {
        return 2 * radius;
    }

    public float getCircumferenceCircle() {
        return 2 * 3.14F * radius;
    }

}
