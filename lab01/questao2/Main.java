package lab01.questao2;

public class Main{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(2, 3);

        System.out.println("Área do Circulo: " + c.getArea());
        System.out.println("Área do Retângulo: " + r.getArea());
    }
}