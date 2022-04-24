package day39_recape.shape;

public class shapes {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.out.println("name can not be null");
            System.exit(1);
        }

        // empty " " and null string are not same
        if (name.isEmpty()||name.isBlank()){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public shapes(String name) {
        setName(name);
    }
    public double area(){
        return 0;
    }
    public  double perimeter(){
        return 0;
    }

}
