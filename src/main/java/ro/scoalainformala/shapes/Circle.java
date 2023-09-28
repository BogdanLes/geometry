package ro.scoalainformala.shapes;

public class Circle extends Shape {

    // fiindca nu am definit explicit macar un constructor in clasa Circle
    // JVM-ul creeaza unul (implicit) pentru noi - il numim constructor default (no-arg - "no arguments" constructor)

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {}

    private float radius;

    public void setRadius(float rad) {
        radius = rad;
    }

    @Override
    public float getArea() {
        return 3.14F * radius * radius;
    }

    public float getDiameterCircle() {
        return 2 * radius;
    }

    @Override
    public float getPerimeter() {
        return 2 * 3.14F * radius;
    }

}
