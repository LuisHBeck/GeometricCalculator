package SpaceFigures;
public class SquareBasePyramid extends SpaceFigures{
    double side, height, faceHeight;

    public SquareBasePyramid(double side, double height, double faceHeight) {
        this.side = side;
        this.height = height;
        this.faceHeight = faceHeight;
    }

    @Override
    public double calculateVolume() {
        return (side*side) * height / 3;
    }

    @Override
    public double calculateSurfaceArea() {
        return (side*side) + (4*side) * faceHeight / 2;
    }

    @Override
    public String toString() {
        return "Volume = "+ calculateVolume() + "\n" +
        "Surface Area = "+ calculateSurfaceArea() + "\n";
    } 
}
