public class Circle extends Shape{
    private double radius;

    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateCircumference(){
        return 2* Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius: (%.2f) Centered at X: (%.2f) Y: (%.2f) ", radius, x, y);
    }
}