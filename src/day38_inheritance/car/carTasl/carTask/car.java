package day38_inheritance.car.carTasl.carTask;

public class car {

    public String brand, model;
    public int year;
    public double price;
    public String color;
    public int miles;

    public car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }


    public void start(){//we are using void becaue static does not accept any changes
        System.out.println(brand +" "+ model + " is starting");

    }

    public void drive(){
        System.out.println(brand +" " + model+" is driving" );

    }
    /*
    public void fly(){

    }


   fly is not common for all class, and parent class shouldonly contain the common feaatures
     */

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }



}
