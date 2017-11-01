package ClassBox;

public class Rectangular {


    private double length;
    private double width;
    private double height;


    public void Calculate(){
        double surArea= (2*this.length*this.width)+(2*this.length*this.height)+(2*this.width*this.height);
        double literalSur=(2*this.length*this.height)+(2*this.width*this.height);
        double volume = this.length*this.width*this.height;
        System.out.println(String.format("Surface Area - %.2f",surArea));
        System.out.println(String.format("Lateral Surface Area - %.2f",literalSur));
        System.out.println(String.format("Volume - %.2f",volume));
    }

    public void setHeight(double height) {
        if(height<=0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }
    public void setWidth(double width) {
        if(width<=0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public void setLength(double length) {
        if(length<=0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }
}
