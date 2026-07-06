public class PavaoAdapter implements Ave {

    private final Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }

    @Override
    public void voar() {
        System.out.print("[adaptado] ");
        pavao.correr();
    }
}
