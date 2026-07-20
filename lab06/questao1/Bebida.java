package lab06.questao1;

public abstract class Bebida {
    public final void prepararReceita(){
        aquecerAgua();
        prepararBebida();
        colocarNaXicara();
        adicionarCondimentos();
    }

    // passos iguais para todas as bebidas - concretos
    private void aquecerAgua(){
        System.out.println("Aquecendo Agua");
    }
    private void colocarNaXicara(){
        System.out.println("Colocando na Xicara");
    }

    // passos que variam para cada bebida deve ser implementado
    protected abstract void prepararBebida();
    protected abstract void adicionarCondimentos();
}
