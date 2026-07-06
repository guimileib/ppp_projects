package questao1;

public class Capuccino extends Bebida {

    @Override
    public void prepararBebida() {
        System.out.println("Coando o café");
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Adicionando leite vaporizado e canela");
    }
}
