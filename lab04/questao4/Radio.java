package lab04.questao4;

public class Radio {
    private double frequencia;
    private boolean botao;

    public void ligarRadio(){
        System.out.println("Ligando radio...");
        botao = true;
    }

    public void desligarRadio(){
        System.out.println("Desligando radio...");
        botao = false;
    }

    public void sintonizar(double frequencia){
        System.out.println("Você está sintonziando a frequencia em: " + frequencia + "hz");
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    
    public boolean isBotao() {
        return botao;
    }

    public void setBotao(boolean botao) {
        this.botao = botao;
    }

}
