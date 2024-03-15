public class App {
    public static void main(String[] args) throws Exception {
        RightTriangle ABC = new RightTriangle(name: "ABC", base: 3.0, height: 4.0);
        Triangle BCD = new RightTriangle(name: "BCD", base: 3.0, height: 4.0);
        Triangle CDE = new Triangle(name: "CDE", sidel: 3.0, side2: 4.0, side3: 5.0);
        ABC.getInfo();
        BCD.getInfo();
        CDE.getInfo();
    }
}
