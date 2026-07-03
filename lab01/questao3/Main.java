package lab01.questao3;

public class Main{
    public static void main(String[] args) {
        Crow corvo = new Crow();

        corvo.eat();
        corvo.fly();
        corvo.sleep();

        Penguin penguin = new Penguin();

        penguin.eat();
        penguin.sleep();
    }
}