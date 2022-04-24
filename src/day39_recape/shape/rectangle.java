package day39_recape.shape;

public class rectangle extends shapes{

    private double length, width;

    public rectangle(String name) {
        super(name);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<= 0){
            System.err.println("invalid length: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<= 0){
            System.err.println("invalid width: " + width);
            System.exit(1);
        }
        this.width = width;
    }

    public rectangle(String name, double length, double width) {
        super("rectangle");
        setLength(length);
        setWidth(width);
    }
}
