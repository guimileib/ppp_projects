package questao1;

public abstract class Bebida {

    // metodos concretos
    public void aquecerAgua() {
        System.out.println("Aquecendo a água");
    }

    public void colocarNaXicara() {
        System.out.println("Colocando na xícara");
    }

    // metodos abstratos
    public abstract void prepararBebida();
    public abstract void adicionarCondimentos();

    // template method
    public final void prepararReceita() {
        aquecerAgua();
        prepararBebida(); // abstrato
        colocarNaXicara();
        adicionarCondimentos(); // abstrato
    }
}
