package questao1;

public class Cha extends Bebida {

    @Override
    public void prepararBebida() {
        System.out.println("Mergulhando o saquinho de chá");
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Adicionando limão");
    }
}
