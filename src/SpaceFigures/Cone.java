package SpaceFigures;
public class Cone extends SpaceFigures{
    double ray, generatrix, height;
    double PI = 3.14;

    public Cone(double ray, double generatrix, double height, double pI) {
        this.ray = ray;
        this.generatrix = generatrix;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (1/3)*height*PI*(ray*ray);
    }

    @Override
    public double calculateSurfaceArea() {
        return PI * ray * (ray + generatrix);
    }
    
}
