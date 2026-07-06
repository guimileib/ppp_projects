package questao1;

public class Cafe extends Bebida {

    @Override
    public void prepararBebida() {
        System.out.println("Coando o café");
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Adicionando açúcar");
    }
}
