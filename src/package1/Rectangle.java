public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double x, double y, double height, double width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return height * width;
    }

    @Override
    public double calculateCircumference(){
        return (2*height)+(2*width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with height: (%.2f) and width: (%.2f) Centered at X: (%.2f) Y: (%.2f) ", height, width, x, y);
    }
}
