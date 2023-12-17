package DZ.seminar_1;

public class Rectangle implements Figure{
    private Double length;
    private Double width;
    public Rectangle(Double length, Double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle() {

    }

    public Double calculateArea() {
        return length * width;
    }

    public Double calculatePerimeter() {
        return (width + length) * 2;
    }
}
