package FlatFigures;
public class Hexagon extends FlatFigures {
    double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6*side*(Math.sqrt(3))/4;
    }

    @Override
    public double calculatePerimeter() {
        return side*6;
    }

    @Override
    public String toString() {
        return "Area = "+ calculateArea() + "\n" +
        "Perimeter =" + calculatePerimeter() + "\n";
    }
}
