package SpaceFigures;
public class Ball extends SpaceFigures{
    double ray;
    double PI = 3.14;

    public Ball(double ray) {
        this.ray = ray;
    }

    @Override
    public double calculateVolume() {
        return (4/3) * PI * (ray * ray);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * PI * (ray * ray);
    }
    
}
