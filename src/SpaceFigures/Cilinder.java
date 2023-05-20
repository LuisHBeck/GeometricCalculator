package SpaceFigures;
public class Cilinder extends SpaceFigures{
    double ray, height;
    double PI = 3.14;

    public Cilinder(double ray, double height) {
        this.ray = ray;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return PI * ray * height;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2*PI*ray*height + 2*PI*(ray*ray);
    }

    @Override
    public String toString() {
        return "Volume = "+ calculateVolume() + "\n" +
        "Surface Area = "+ calculateSurfaceArea() + "\n";
    } 
}
