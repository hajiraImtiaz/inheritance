package day39_recape.shape;

public class circle extends  shapes {

    private double radius;
    public static double pi = 3.14;

    public circle(String name) {
        super(name);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.err.println("invalid radius:" + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }
}
