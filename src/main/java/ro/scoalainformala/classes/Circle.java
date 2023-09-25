package ro.scoalainformala.classes;

public class Circle {

    private float radius;
    private float areaCircle;
    private float diameterCircle;
    private float circumferenceCircle;

    public void setRadius(float rad) {
        radius = rad;
        areaCircle = 3.14F * radius * radius;
        diameterCircle = 2 * radius;
        circumferenceCircle = 2 * 3.14F * radius;
    }

    public float getAreaCircle() {
        return areaCircle;
    }

    public float getDiameterCircle() {
        return diameterCircle;
    }

    public float getCircumferenceCircle() {
        return circumferenceCircle;
    }

}
