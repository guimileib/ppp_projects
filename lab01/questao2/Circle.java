package lab01.questao2;

public class Circle implements GeometricShape{
    
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int getArea(){
        return (int) (Math.PI * radius * radius);
    }
    
    
}