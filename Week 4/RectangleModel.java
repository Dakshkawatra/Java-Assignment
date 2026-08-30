public class RectangleModel {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Is Square: " + r1.isSquare());

        Rectangle r2 = new Rectangle(5);

        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
        System.out.println("Is Square: " + r2.isSquare());

        Rectangle r3 = new Rectangle(4, 6);

        System.out.println(r3);
        System.out.println("Area: " + r3.getArea());
        System.out.println("Perimeter: " + r3.getPerimeter());
        System.out.println("Is Square: " + r3.isSquare());

        r3.scale(2);

        System.out.println("After scaling:");
        System.out.println(r3);
    }
}
