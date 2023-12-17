package DZ.seminar_1;

public class Program {
    public static void main(String[] args) {
        Circle circle = new Circle(7.3);
        System.out.printf("%.2f\n", circle.calculateArea());
        System.out.printf("%.2f\n", circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(5.0, 12.5);
        System.out.printf("%.2f\n", rectangle.calculateArea());
        System.out.printf("%.2f\n", rectangle.calculatePerimeter());

        Square square = new Square(6.1);
        System.out.printf("%.2f\n", square.calculateArea());
        System.out.printf("%.2f\n", square.calculatePerimeter());
    }
}
