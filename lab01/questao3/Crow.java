package lab01.questao3;

public class Crow implements Bird, FlyingBird{

    @Override
    public void eat() {
        System.out.println("Corvo comendo");
    }

    @Override
    public void sleep() {
        System.out.println("Corvo dormindo");
    }

    @Override
    public void fly() {
        System.out.println("Corvo voando");
    }
    
}
