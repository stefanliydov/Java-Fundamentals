package shapes;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {

        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    void calculatePerimeter() {
        System.out.println(2*(this.width+this.height));
    }

    @Override
    void calculateArea() {
        System.out.println(this.width*this.height);
    }
}
