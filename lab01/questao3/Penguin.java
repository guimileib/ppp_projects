package lab01.questao3;

public class Penguin implements Bird{

    @Override
    public void eat() {
        System.out.println("Pinguim comendo!");
    }

    @Override
    public void sleep() {
        System.out.println("Pinguim dormindo...");
    }


}
