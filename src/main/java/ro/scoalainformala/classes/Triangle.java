package ro.scoalainformala.classes;

public class Triangle {

    private float l1;
    private float l2;
    private float l3;

    public Triangle(float vl1, float vl2, float vl3) {
        this.l1 = vl1;
        this.l2 = vl2;
        this.l3 = vl3;
    }

    public float getAreaTriangle() {
        float sm = getPerimeterTriangle() / 2;
        return (float) Math.sqrt(sm * (sm - l1) * (sm - l2) * (sm - l3));
    }

    public float getPerimeterTriangle() {
        return l1 + l2 + l3;
    }

}
