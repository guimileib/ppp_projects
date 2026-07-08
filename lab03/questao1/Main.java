package lab03.questao1;

public class Main {
    public static void main(String[] args) {
        // Pato é Ave
        Ave pato = new PatoDomestico();
        pato.emitirSom();
        pato.voar();

        // PavaoAzul nao é uma ave
        PavaoAzul pavao = new PavaoAzul();

        // envelope passando dentro do adapter, ai ele vira Ave
        Ave pavaoComoAve = new PavaoAdapter(pavao);
        pavaoComoAve.emitirSom();
        pavaoComoAve.voar();
    }
}
