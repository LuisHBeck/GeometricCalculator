package SpaceFigures;
public class Cube extends SpaceFigures{
    double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return side*side*side;
    }

    @Override
    public double calculateSurfaceArea() {
        return 6*side*side;
    }

    @Override
    public String toString() {
        return "Volume = "+ calculateVolume() + "\n" +
        "Surface Area = "+ calculateSurfaceArea() + "\n";
    } 
}
