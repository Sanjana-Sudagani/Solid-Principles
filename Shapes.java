import java.awt.geom.Area;

class Rectangle{
        public double length;
        public double width;
    }

    class Circle{
        public double radius;
    }

    class AreaCalculate {

        public double CalculateAreaRectangle(Rectangle Rect){
            return Rect.length*Rect.width;

        }
        public double CalculateCircleArea(Circle circle){
            return (22/7)*circle.radius*circle.radius;
        }

    }

public class Shapes {
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        r.length=20;
        r.width=30;
        AreaCalculate ac=new AreaCalculate();
        System.out.println(ac.CalculateAreaRectangle(r));

        Circle c=new Circle();
        c.radius=15;
        System.out.println(ac.CalculateCircleArea(c));
    }

}
