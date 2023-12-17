package DZ.seminar_1;

public class Circle implements Figure{
    private Double radius;
    public Circle(Double radius){
        this.radius = radius;
    }
    public Double calculateArea() {
        return radius * radius * Math.PI;
    }
    public Double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
