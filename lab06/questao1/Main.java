package lab06.questao1;

public class Main {
    public static void main(String[] args) {
        // No Template Method o cliente chama SO o template method (prepararReceita).
        // Nunca os passos individuais - a classe base controla a ordem.
        Bebida cafe = new Cafe();
        cafe.prepararReceita();

        System.out.println("------");

        Bebida cha = new Cha();
        cha.prepararReceita();

        System.out.println("------");

        Bebida capuccino = new Capuccino();
        capuccino.prepararReceita();
    }
}
