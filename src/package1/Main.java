import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            double x = Math.random() * 100;
            double y = Math.random() * 100; 
            double radius = Math.random() * 50;  
            shapes.add(new Circle(x, y, radius));
        }
        
        for (int i = 0; i < 5; i++) {
            double x = Math.random() * 100;
            double y = Math.random() * 100;  
            double height = Math.random() * 100;
            double width = Math.random() * 100;   
            shapes.add(new Rectangle(x, y, height, width));
        }

        if (shapes.size() == 10) {
            System.out.println("La lista ya tiene 10 figuras");
        } else {
            System.out.println("La lista no tiene las 10 figuras.");
        }


        System.out.println(getInfo(shapes));

        System.out.println("Info de los círculos:");
        System.out.println(findCircles(shapes));
    }

    
    public static String getInfo(ArrayList<Shape> shapes) {
        StringBuilder sb = new StringBuilder();

        for (Shape shape : shapes) {
            sb.append(shape.toString())  
              .append("\nHas area: ")
              .append(String.format("%.2f", shape.calculateArea()))  
              .append("\nHas circumference: ")
              .append(String.format("%.2f", shape.calculateCircumference()))
              .append("\n");  
        }

        return sb.toString();
    }

    
    public static String findCircles(ArrayList<Shape> shapes) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {  
                sb.append(shape.toString()) 
                  .append("\n");  
            }
        }

        return sb.toString();
    }
}
