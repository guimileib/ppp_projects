package lab04.questao1;

public class Pizzaria {
    public static void main(String[] args) {
        // pedindo um tipo de pizza com massa fina
        Pizza pedido1 =  new MassaFina();
        // "decorando", fazendo pizza Marguerita
        pedido1 = new Queijo(pedido1);
        pedido1 = new Tomate(pedido1);

        System.out.println(pedido1.getDescricao());

        // fazendo mostrando o decorator
        Pizza portuguesa = new Tomate(new Ovo(new Queijo(new MassaEspessa())));
        System.out.println(portuguesa.getDescricao() + portuguesa.getValor());
    }
}
