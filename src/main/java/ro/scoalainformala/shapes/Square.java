package ro.scoalainformala.shapes;

public class Square extends Rectangle {

    // Square mosteneste clasa Rectangle (inherits) =>
    // principiul mostenirii (inheritance)
    // Square are o relatie de tip "is-a" cu Rectangle
    // Square este un subtip al tipului Rectangle
    // Rectangle este un supertip al tipului Square
    // Square este copil al clasei Rectangle
    // Rectangle este parinte al clasei Square
    // clasa Square este o specializare a clasei Rectangle

    public Square(float side) {
        super(side, side);
    }
}
