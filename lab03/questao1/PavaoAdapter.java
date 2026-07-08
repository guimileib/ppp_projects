package lab03.questao1;

public class PavaoAdapter implements Ave {
    // o adapter vai guardar o objeto que vai adaptar
    private Pavao pavao;

    public PavaoAdapter(Pavao pavao){
        this.pavao = pavao;
    }

    // faço adaptação do que o pavao faz, cantar
    @Override
    public void emitirSom(){
        pavao.cantar();
    }

    @Override
    public void voar(){
        // pavao nao voa, adapter decide
        System.out.println("Pavao não voa, so assusta!");
    }

}
