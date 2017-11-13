package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public final double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calculatePerimeter() {
        System.out.println(2*Math.PI*this.radius);
    }

    @Override
    void calculateArea() {
        System.out.println(Math.PI*this.radius*this.radius);
    }
}
