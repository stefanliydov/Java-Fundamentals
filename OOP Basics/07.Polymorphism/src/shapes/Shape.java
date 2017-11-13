package shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    abstract void calculatePerimeter();
    abstract void calculateArea();

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
