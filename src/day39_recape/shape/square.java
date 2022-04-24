package day39_recape.shape;

public class square extends shapes {


    private double side;

    public square(String name) {
        super(name);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.out.println("invalid side: "+side);
            System.exit(1);
        }
        this.side = side;
    }

    public square(String name, double side) {
        super("square");
        // this.side = side;// through this even -tive number can be set as length of squre thats why we change it
        setSide(side);// we call set method to ensure up given condition were only published
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "shapes{" +
                "side ='" + side + '\'' +
                ", area='" + area()+ '\''+
                ", perimeter='" + perimeter()+ '\'' +
                '}';
    }
}
