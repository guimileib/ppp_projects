public abstract class Pato implements Ave {

    @Override
    public void voar() {
        System.out.println("Pato voando, batendo as asas baixinho.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Quack! Quack! (grasnado)");
    }
}
