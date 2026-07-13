package lab04.questao1;

public class Pizzaria {
    public static void main(String[] args) {
        // pedindo um tipo de pizza com massa fina
        Pizza marguerita =  new MassaFina();
        // "decorando", fazendo pizza Marguerita
        marguerita = new Queijo(marguerita);
        marguerita = new Tomate(marguerita);

        System.out.println("Pizza: " + marguerita.getDescricao());
        System.out.println("Valor: " + marguerita.getValor());

        // fazendo mostrando o decorator
        Pizza portuguesa = new Tomate(new Ovo(new Queijo(new MassaEspessa())));
        System.out.println("\n" + "Pizza: " + portuguesa.getDescricao() + "\nValor: " + portuguesa.getValor());
    }
}
