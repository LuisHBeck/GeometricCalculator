package FlatFigures;
public class Circle extends FlatFigures{
    double ray;
    final double PI = 3.14;

    public Circle(double ray) {
        this.ray = ray;
    }

    @Override
    public double calculateArea() {
        return  PI*ray*ray;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*ray;
    }

    @Override
    public String toString() {
        return "Area = "+ calculateArea() + "\n" +
        "Perimeter =" + calculatePerimeter() + "\n";
    }
}
