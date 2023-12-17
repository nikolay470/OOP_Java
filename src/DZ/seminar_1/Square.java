package DZ.seminar_1;
public class Square extends Rectangle implements Figure {
    private Double side;
    public Square(Double side) {
        this.side = side;
    }
    @Override
    public Double calculateArea() {
        return side * side;
    }
    @Override
    public Double calculatePerimeter() {
        return side * 4;
    }
}
