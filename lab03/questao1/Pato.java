package lab03.questao1;

public class Pato implements Ave{
    @Override
    public void voar(){
        System.out.println("Pato voando!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Quack Quack!");
    }
}
