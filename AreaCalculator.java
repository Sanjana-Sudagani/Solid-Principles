interface Shape{
    public double CalculateArea();
}

class Rectangles implements Shape{
    double length, width;
    public double CalculateArea(){
        return length*width;
    }
}

class Circles implements Shape{
    double radius;
    public double CalculateArea(){
        return (22/7)*radius*radius;
    }
}

class Calculator {
    public double CalculateShapeArea(Shape shape){
        return shape.CalculateArea();
    }
}

public class AreaCalculator{
    public static void main(String[] args){
        Rectangles r=new Rectangles();
        r.length=20;
        r.width=30;
        Calculator ac=new Calculator();
        System.out.println(ac.CalculateShapeArea(r));

        Circles c=new Circles();
        c.radius=15;
        System.out.println(ac.CalculateShapeArea(c));
    }
}
