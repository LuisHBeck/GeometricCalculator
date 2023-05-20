package FlatFigures;
public class Square extends FlatFigures{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Area = "+ calculateArea() + "\n" +
        "Perimeter =" + calculatePerimeter() + "\n";
    }

}
