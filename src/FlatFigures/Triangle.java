package FlatFigures;
public class Triangle extends FlatFigures{
    double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side*(Math.sqrt(3))/4;
    }

    @Override
    public double calculatePerimeter() {
        return side*3;
    }

    @Override
    public String toString() {
        return "Area = "+ calculateArea() + "\n" +
        "Perimeter =" + calculatePerimeter() + "\n";
    }
}

