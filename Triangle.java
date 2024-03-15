public class Triangle extends Shape {
    protected Double sidel;
    protected Double side2;
    protected Double side3;

    public Triangle() {
        this.sidel = 0.0;
        this.side2 = 0.0;
        this.side3 = 0.0;
    }

    public Triangle(String name, Double sidel, Double side2, Double side3) {
        this.name = name;
        this.sidel = sidel;
        this.side2 = side2;
        this.side3 = side3;
        this.calculateArea();
    }

    protected void calculateArea() {
        /* Using heron formula */
        double halfPerimeter = (sidel + side2 + side3) / 2;
        super.area = Math.sqrt(halfPerimeter * (halfPerimeter - sidel) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    public void getInfo() {
        System.out.print("Triangle " + name + " info");
        System.out.print(" area: " + super.area);
        System.out.print(" with sides: " + sidel);
        System.out.print(", " + side2);
        System.out.print(", " + side3);
        System.out.println();
    }
}
